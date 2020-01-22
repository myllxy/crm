package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Customer;
import cn.itsource.crm.domain.CustomerTraceHistory;
import cn.itsource.crm.query.CustomerQuery;
import cn.itsource.crm.query.CustomerTraceHistoryQuery;
import cn.itsource.crm.service.ICustomerService;
import cn.itsource.crm.service.ICustomerTraceHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customertracehistory")
@CrossOrigin
public class CustomerTraceHistoryController {

    @Autowired
    private ICustomerTraceHistoryService customerTraceHistoryService;

    @RequestMapping(value = "/list", method = RequestMethod.PATCH)
    @ResponseBody
    public List<CustomerTraceHistory> list() {
        return customerTraceHistoryService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH)
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<CustomerTraceHistory> selectPageByQuery(@RequestBody CustomerTraceHistoryQuery customerTraceHistoryQuery) {
        return customerTraceHistoryService.selectPageByQuery(customerTraceHistoryQuery);
    }


    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "添加客户跟进记录")
    @ResponseBody
    public AjaxResult save(@RequestBody CustomerTraceHistory customerTraceHistory) {
        try {
            customerTraceHistoryService.save(customerTraceHistory);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "更新客户跟进记录")
    @ResponseBody
    public AjaxResult update(@RequestBody CustomerTraceHistory customerTraceHistory) {
        try {
            customerTraceHistoryService.update(customerTraceHistory);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, name = "删除客户跟进记录")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            customerTraceHistoryService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH, name = "批量删除客户跟进记录")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<CustomerTraceHistory> customerTraceHistories) {
        try {
            customerTraceHistoryService.batchDelete(customerTraceHistories);
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
    public CustomerTraceHistory get(@PathVariable("id") Long id) {
        return customerTraceHistoryService.selectById(id);
    }

}
