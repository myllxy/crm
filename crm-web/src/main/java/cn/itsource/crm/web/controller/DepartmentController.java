package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Department;
import cn.itsource.crm.query.DepartmentQuery;
import cn.itsource.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/department")
@CrossOrigin
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;


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
    @RequestMapping(value = "/list", method = RequestMethod.PATCH)
    @ResponseBody
    public List<Department> list() {
        return departmentService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH)
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<Department> selectPageByQuery(@RequestBody DepartmentQuery departmentQuery) {
        return departmentService.selectPageByQuery(departmentQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "sace")
    @ResponseBody
    public AjaxResult save(@RequestBody Department department) {
        try {
            departmentService.save(department);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult update(@RequestBody Department department) {
        try {
            departmentService.update(department);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            departmentService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH)
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<Department> departments) {
        try {
            departmentService.batchDelete(departments);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "删除失败！" + e.getMessage());
        }
    }

    /**
     * 查询单个对象
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Department get(@PathVariable("id") Long id) {
        return departmentService.selectById(id);
    }

    @RequestMapping(value = "/getDepartment", method = RequestMethod.POST)
    @ResponseBody
    public List<Department> getDepartment() {
        return departmentService.getDepartment();
    }
}
