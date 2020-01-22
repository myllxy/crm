package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Resource;
import cn.itsource.crm.query.ResourceQuery;
import cn.itsource.crm.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/resource")
@CrossOrigin
public class ResourceController {

    @Autowired
    private IResourceService resourceService;


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
    public List<Resource> list() {
        return resourceService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH, name = "孙老师好帅啊")
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<Resource> electPageByQuery(@RequestBody ResourceQuery resourceQuery) {
        return resourceService.selectPageByQuery(resourceQuery);
    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT)
    @ResponseBody
    public AjaxResult save(@RequestBody Resource resource) {
        try {
            resourceService.save(resource);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult update(@RequestBody Resource resource) {
        try {
            resourceService.update(resource);
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
            resourceService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH)
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<Resource> resource) {
        try {
            resourceService.batchDelete(resource);
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
    public Resource get(@PathVariable("id") Long id) {
        return resourceService.selectById(id);
    }

}
