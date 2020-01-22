package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.shiro.util.UserContext;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class LoginController {

    /**
     * 登录核心代码
     * @param employee
     * @return
     */
    @RequestMapping(value = "login",method = RequestMethod.POST, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult login(@RequestBody Employee employee, HttpSession session){
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //如果没有认证则开始认证
        if(!subject.isAuthenticated()){
            try {
                UsernamePasswordToken token = new UsernamePasswordToken(employee.getUsername(), employee.getPassword());
                subject.login(token);
            } catch (UnknownAccountException e) {
                e.printStackTrace();
                return new AjaxResult(false, "用户名不存在!");
            }catch (IncorrectCredentialsException e){
                e.printStackTrace();
                return new AjaxResult(false, "密码错误!");
            }catch (Exception e){
                e.printStackTrace();
                return new AjaxResult(false, "网络繁忙请稍后再试！!");
            }
        }
        AjaxResult result = new AjaxResult();

        //把登录用户放到session中(存储到web  中的session中)
        UserContext.setUser(session);
        //拿到服务器返回的sessionId
        Serializable sessionId = subject.getSession().getId();
        //创建一个map集合，该集合装sessionId和登录用户
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", sessionId);
        map.put("object", subject.getPrincipal());
        result.setObject(map);
        return result;
    }
}
