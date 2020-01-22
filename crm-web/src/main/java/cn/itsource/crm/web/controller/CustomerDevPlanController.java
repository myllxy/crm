package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.CustomerDevPlan;
import cn.itsource.crm.query.CustomerDevPlanQuery;
import cn.itsource.crm.service.ICustomerDevPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customerDevPlan")
@CrossOrigin
public class CustomerDevPlanController {

    @Autowired
    private ICustomerDevPlanService customerDevPlanService;
    /*
    * 查询所有
    * */
    @RequestMapping(value = "/list", method = RequestMethod.PATCH,name = "查询所有开发计划")
    @ResponseBody
    public List<CustomerDevPlan> list() {
        return customerDevPlanService.selectAll();
    }
    /*
    * 根据条件分页查询
    * */
    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH,name = "分页查询开发计划")
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<CustomerDevPlan> selectPageByQuery(@RequestBody CustomerDevPlanQuery customerDevPlanQuery) {
        return customerDevPlanService.selectPageByQuery(customerDevPlanQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT,name = "添加客户开发计划")
    @ResponseBody
    public AjaxResult save(@RequestBody CustomerDevPlan customerDevPlan) {
        try {
            customerDevPlanService.save(customerDevPlan);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,name = "修改客户开发计划")
    @ResponseBody
    public AjaxResult update(@RequestBody CustomerDevPlan customerDevPlan) {
        try {
            customerDevPlanService.update(customerDevPlan);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE,name = "删除客户开发计划")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            customerDevPlanService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH,name = "批量删除客户开发计划")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<CustomerDevPlan> customerDevPlans) {
        try {
            customerDevPlanService.batchDelete(customerDevPlans);
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
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET,name = "查询单个客户开发计划")
    @ResponseBody
    public CustomerDevPlan get(@PathVariable("id") Long id) {
        return customerDevPlanService.selectById(id);
    }

}
