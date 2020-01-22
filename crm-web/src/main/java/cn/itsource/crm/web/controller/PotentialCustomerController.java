package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.PotentialCustomer;
import cn.itsource.crm.query.PotentialCustomerQuery;
import cn.itsource.crm.service.IPotentialCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/potentialCustomer")
@CrossOrigin
public class PotentialCustomerController {

    @Autowired
    private IPotentialCustomerService potentialCustomerService;
    /*
    * 查询所有
    * */
    @RequestMapping(value = "/list", method = RequestMethod.PATCH,name = "查询所有潜在用户")
    @ResponseBody
    public List<PotentialCustomer> list() {
        return potentialCustomerService.selectAll();
    }
    /*
    * 根据条件分页查询
    * */
    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH,name = "分页查询潜在用户")
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<PotentialCustomer> selectPageByQuery(@RequestBody PotentialCustomerQuery potentialCustomerQuery) {
        return potentialCustomerService.selectPageByQuery(potentialCustomerQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT,name = "添加潜在用户")
    @ResponseBody
    public AjaxResult save(@RequestBody PotentialCustomer potentialCustomer) {
        try {
            potentialCustomerService.save(potentialCustomer);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,name = "修改潜在用户")
    @ResponseBody
    public AjaxResult update(@RequestBody PotentialCustomer potentialCustomer) {
        try {
            potentialCustomerService.update(potentialCustomer);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE,name = "删除潜在用户")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            potentialCustomerService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH,name = "批量删除潜在用户")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<PotentialCustomer> potentialCustomers) {
        try {
            potentialCustomerService.batchDelete(potentialCustomers);
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
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET,name = "查询单个潜在用户")
    @ResponseBody
    public PotentialCustomer get(@PathVariable("id") Long id) {
        return potentialCustomerService.selectById(id);
    }

}
