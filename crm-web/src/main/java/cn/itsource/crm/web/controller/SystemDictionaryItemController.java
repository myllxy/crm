package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.SystemDictionaryItem;
import cn.itsource.crm.query.SystemDictionaryItemQuery;
import cn.itsource.crm.service.ISystemDictionaryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/systemDictionaryItem")
@CrossOrigin
public class SystemDictionaryItemController {

    @Autowired
    private ISystemDictionaryItemService systemDictionaryItemService;


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
    public List<SystemDictionaryItem> list() {
        return systemDictionaryItemService.selectAll();
    }
    /*查询客户来源*/
    @RequestMapping(value = "/selectCustomerSources", method = RequestMethod.PATCH)
    @ResponseBody
    public List<SystemDictionaryItem> selectCustomerSources() {
        return systemDictionaryItemService.selectCustomerSources();
    }
    /*查询计划实施方式*/
    @RequestMapping(value = "/selectPlanType", method = RequestMethod.PATCH,name = "查询所有计划实施方式")
    @ResponseBody
    public List<SystemDictionaryItem> selectPlanType() {
        return systemDictionaryItemService.selectPlanType();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH,name = "分页查询数据字典明细")
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<SystemDictionaryItem> electPageByQuery(@RequestBody SystemDictionaryItemQuery systemDictionaryItemQuery) {
        return systemDictionaryItemService.selectPageByQuery(systemDictionaryItemQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT,name = "添加数据字典明细")
    @ResponseBody
    public AjaxResult save(@RequestBody SystemDictionaryItem systemDictionaryItem) {
        try {
            systemDictionaryItemService.save(systemDictionaryItem);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST,name = "修改数据字典明细")
    @ResponseBody
    public AjaxResult update(@RequestBody SystemDictionaryItem systemDictionaryItem) {
        try {
            systemDictionaryItemService.update(systemDictionaryItem);
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
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE,name = "删除数据字典明细")
    @ResponseBody
    public AjaxResult delete(@PathVariable("id") Long id) {
        try {
            systemDictionaryItemService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH,name = "批量删除数据字典明细")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<SystemDictionaryItem> systemDictionaryItem) {
        try {
            systemDictionaryItemService.batchDelete(systemDictionaryItem);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "删除失败！" + e.getMessage());
        }
    }

    /**
     * 查询单个对象
     *
     * @param requence
     * @return
     */
    @RequestMapping(value = "/get/{requence}", method = RequestMethod.GET,name = "根据明细编号查询单个数据字典明细")
    @ResponseBody
    public SystemDictionaryItem get(@PathVariable("requence") Long requence) {
        return systemDictionaryItemService.selectByRequence(requence);
    }


}
