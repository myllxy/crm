package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Employee;
import cn.itsource.crm.query.EmployeeQuery;
import cn.itsource.crm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;


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
    public List<Employee> list() {
        return employeeService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH, name = "孙老师好帅啊")
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<Employee> selectPageByQuery(@RequestBody EmployeeQuery employeeQuery) {
        PageResult<Employee> employeePageResult = employeeService.selectPageByQuery(employeeQuery);
        return employeePageResult;
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult save(@RequestBody Employee employee) {
        try {
            employeeService.save(employee);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult update(@RequestBody Employee employee) {
        try {
            employeeService.update(employee);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            employeeService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<Employee> employees) {
        try {
            employeeService.batchDelete(employees);
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
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, name = "孙老师好帅啊")
    @ResponseBody
    public Employee get(@PathVariable("id") Long id) {
        return employeeService.selectById(id);
    }

    @RequestMapping(value = "/getEmployee", method = RequestMethod.POST)
    @ResponseBody
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    /**
     * 通过sn来找到employee对象
     *
     * @param sn
     * @return
     */
    @RequestMapping(value = "/getEmployeeBySn/{sn}", method = RequestMethod.GET, name = "孙老师好帅啊")
    @ResponseBody
    public Employee getEmployeeBySn(@PathVariable("sn") Long sn) {
        return employeeService.getEmployeeBySn(sn);
    }

    /**
     * 通过name来找到employee对象
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/getEmployeeByName/{name}", method = RequestMethod.GET, name = "孙老师好帅啊")
    @ResponseBody
    public Employee getEmployeeByName(@PathVariable("name") String name) {
        return employeeService.getEmployeeByName(name);
    }
}
