package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.domain.Role;
import cn.itsource.crm.domain.SystemMenu;
import cn.itsource.crm.service.IEmployeeService;
import cn.itsource.crm.service.IPermissionService;
import cn.itsource.crm.service.ISystemMenuService;
import cn.itsource.crm.shiro.util.UserContext;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
public class LoginController {
    @Autowired
    private ISystemMenuService systemMenuService;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IPermissionService permissionService;

    /**
     * 登录核心代码
     *
     * @param employee
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult login(@RequestBody Employee employee, HttpSession session) {
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //如果没有认证则开始认证
        if (!subject.isAuthenticated()) {
            try {
                UsernamePasswordToken token = new UsernamePasswordToken(employee.getUsername(), employee.getPassword());
                subject.login(token);
            } catch (UnknownAccountException e) {
                e.printStackTrace();
                return new AjaxResult(false, "用户名不存在!");
            } catch (IncorrectCredentialsException e) {
                e.printStackTrace();
                return new AjaxResult(false, "密码错误!");
            } catch (Exception e) {
                e.printStackTrace();
                return new AjaxResult(false, "网络繁忙请稍后再试！!");
            }
        }
        AjaxResult result = new AjaxResult();

        //把登录用户放到session中(存储到web  中的session中)
        UserContext.setUser(session);
        Employee e = UserContext.getEmployee();
        /* 1.通过当前用户拿到其对应的角色 */
        /* 因为employee与role的关系是维护在中间表的,所以不能通过e.getRoles()获取 */
        List<Role> roles = employeeService.queryRolesByEmployeeSn(e.getSn());
        /* 2.通过角色拿到对应的权限 */
        List<Permission> permissions = new ArrayList<>();
        for (Role role : roles) {
            List<Permission> permissionList = permissionService.selectPermissionByRoleSn(role.getSn());
            for (Permission permission : permissionList) {
                permissions.add(permission);
            }
        }
        /* 3.通过权限拿到对应的菜单 */
        List<SystemMenu> menus = systemMenuService.getMenusByPermission(permissions);
        /* 4.让前端页面可以拿到这个菜单列表 */
        e.setSystemMenus(menus);
        //拿到服务器返回的sessionId
        Serializable sessionId = subject.getSession().getId();
        //创建一个map集合，该集合装sessionId和登录用户
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", sessionId);
        map.put("object", e);
        result.setObject(map);
        return result;
    }
}
