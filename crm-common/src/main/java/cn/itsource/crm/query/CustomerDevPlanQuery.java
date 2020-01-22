package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;

/**
 * 潜在客户开发计划查询对象
 * @author lb
 * @create 2020-01-08 0:02
 */
public class CustomerDevPlanQuery extends BaseQuery{
    //计划主题
    private String planSubject;

    public String getPlanSubject() {
        return planSubject;
    }

    public void setPlanSubject(String planSubject) {
        this.planSubject = planSubject;
    }
}
