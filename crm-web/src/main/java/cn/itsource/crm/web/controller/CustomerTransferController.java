package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.CustomerTransfer;
import cn.itsource.crm.domain.CustomerTransfer;
import cn.itsource.crm.query.CustomerTransferQuery;
import cn.itsource.crm.service.ICustomerTransferService;
import cn.itsource.crm.service.ICustomerTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customertransfer")
@CrossOrigin
public class CustomerTransferController {

    @Autowired
    private ICustomerTransferService customerTransferService;

    @RequestMapping(value = "/list", method = RequestMethod.PATCH)
    @ResponseBody
    public List<CustomerTransfer> list() {
        return customerTransferService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH)
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<CustomerTransfer> selectPageByQuery(@RequestBody CustomerTransferQuery customerTransferQuery) {
        return customerTransferService.selectPageByQuery(customerTransferQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "新增客户移交记录")
    @ResponseBody
    public AjaxResult save(@RequestBody CustomerTransfer customerTransfer) {
        try {
            customerTransferService.save(customerTransfer);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "更新客户移交记录")
    @ResponseBody
    public AjaxResult update(@RequestBody CustomerTransfer customerTransfer) {
        try {
            customerTransferService.update(customerTransfer);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, name = "删除客户移交记录")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            customerTransferService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH, name = "批量删除客户移交记录")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<CustomerTransfer> customerTransfers) {
        try {
            customerTransferService.batchDelete(customerTransfers);
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
    public CustomerTransfer get(@PathVariable("id") Long id) {
        return customerTransferService.selectById(id);
    }

}
