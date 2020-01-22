package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.SystemDictionary;
import cn.itsource.crm.domain.SystemDictionaryItem;
import cn.itsource.crm.query.SystemDictionaryQuery;
import cn.itsource.crm.service.ISystemDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/systemDictionary")
@CrossOrigin
public class SystemDictionaryController {

    @Autowired
    private ISystemDictionaryService systemDictionaryService;


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
    public List<SystemDictionary> list() {
        return systemDictionaryService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH)
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<SystemDictionary> electPageByQuery(@RequestBody SystemDictionaryQuery systemDictionaryQuery) {
        return systemDictionaryService.selectPageByQuery(systemDictionaryQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    @ResponseBody
    public AjaxResult save(@RequestBody SystemDictionary systemDictionary) {
        try {
            systemDictionaryService.save(systemDictionary);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult update(@RequestBody SystemDictionary systemDictionary) {
        try {
            systemDictionaryService.update(systemDictionary);
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
            systemDictionaryService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH)
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<SystemDictionary> systemDictionary) {
        try {
            systemDictionaryService.batchDelete(systemDictionary);
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
    public SystemDictionary get(@PathVariable("id") Long id) {
        return systemDictionaryService.selectById(id);
    }


    /**
     * 返回数据字典明细实体对象集合用于页面数据显示
     *
     * @param sn
     * @return
     */
    @RequestMapping(value = "/getDic/{sn}", method = RequestMethod.GET)
    @ResponseBody
    public List<SystemDictionaryItem> getDic(@PathVariable("sn") Long sn) {
        SystemDictionary systemDictionary = systemDictionaryService.selectBySn(sn);
        return systemDictionary.getDetails();
    }
}
