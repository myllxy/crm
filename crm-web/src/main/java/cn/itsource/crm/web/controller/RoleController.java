package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Role;
import cn.itsource.crm.query.RoleQuery;
import cn.itsource.crm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/role")
@CrossOrigin
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH, name = "查询角色")
    @ResponseBody
    public PageResult<Role> selectPageByQuery(@RequestBody RoleQuery roleQuery) {
        return roleService.selectPageByQuery(roleQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "添加角色")
    @ResponseBody
    public AjaxResult save(@RequestBody Role role) {
        try {
            roleService.save(role);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "修改角色")
    @ResponseBody
    public AjaxResult update(@RequestBody Role role) {
        try {
            roleService.update(role);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, name = "删除角色")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            roleService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "删除失败！" + e.getMessage());
        }
    }
}
