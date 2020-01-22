package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.domain.Permission;
import cn.itsource.crm.query.EmployeeQuery;
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


    /**
     * resetful: 它是一个架构风格，它是基于Http协议的扩展
     * 它给你提供了多种请求方式来定位资源
     * GET      一般是用来做查询的，查询单个对象
     * POST     一般用来做修改的
     * DELETE   一般用来做删除
     * PUT      一般用来做新增
     * PATCH    一般用来操作批量数据的
     *
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.PATCH, name = "孙老师好帅啊")
    @ResponseBody
    public List<Permission> listPermission() {
        return permissionService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH,name = "查询权限")
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<Permission> selectPageByQuery(@RequestBody PermissionQuery permissionQuery) {
        return permissionService.selectPageByQuery(permissionQuery);


    }
}
