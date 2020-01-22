package cn.itsource.crm.web.controller;

import cn.itsource.base.util.AjaxResult;
import cn.itsource.base.util.PageResult;
import cn.itsource.crm.domain.Order;
import cn.itsource.crm.query.OrderQuery;
import cn.itsource.crm.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private IOrderService orderService;


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
   /* @RequestMapping("/list")*/
    @ResponseBody
    public List<Order> list() {
        return orderService.selectAll();
    }

    @RequestMapping(value = "/selectPageByQuery", method = RequestMethod.PATCH)
    @ResponseBody
    /* 这里注意RequestBody和RequestParm的区别 */
    public PageResult<Order> selectPageByQuery(@RequestBody OrderQuery orderQuery) {
       /* System.out.println(orderQuery);*/
        return orderService.selectPageByQuery(orderQuery);

    }

    @RequestMapping(value = "/save", method = RequestMethod.PUT, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult save(@RequestBody Order order) {
        try {
            System.out.println(order);
            orderService.save(order);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "添加失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult update(@RequestBody Order order) {
        try {
            orderService.update(order);
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
            orderService.delete(id);
            return new AjaxResult();
        } catch (Exception e) {
            e.printStackTrace();
            return new AjaxResult(false, "修改失败！" + e.getMessage());
        }
    }

    @RequestMapping(value = "/batchDelete", method = RequestMethod.PATCH, name = "孙老师好帅啊")
    @ResponseBody
    public AjaxResult batchDelete(@RequestBody List<Order> orders) {
        try {
            orderService.batchDelete(orders);
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
    public Order get(@PathVariable("id") Long id) {
        return orderService.selectById(id);
    }

}
