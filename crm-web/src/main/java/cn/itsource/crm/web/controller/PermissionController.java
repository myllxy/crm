package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.query.PermissionQuery;
import cn.itsource.crm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/permission")
@CrossOrigin
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping(value = "/list", method = RequestMethod.PATCH)
    @ResponseBody
    public List<Permission> listPermission() {
        return permissionService.selectAll();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "更新用户")
    @ResponseBody
    public AjaxResult update(@RequestBody Permission permission) {
        try {
            permissionService.update(permission);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "添加用户")
    @ResponseBody
    public AjaxResult save(@RequestBody Permission permission) {
        try {
            permissionService.save(permission);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH)
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<Permission> selectPageByQuery(@RequestBody PermissionQuery permissionQuery) {
        return permissionService.selectPageByQuery(permissionQuery);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, name = "删除权限")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            permissionService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "删除失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH, name = "批量删除权限")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<Permission> permissions) {
        try {
            permissionService.batchDelete(permissions);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "删除失败！" + e.getMessage());
        }
    }
}
