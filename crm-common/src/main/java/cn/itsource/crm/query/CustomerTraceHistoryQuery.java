package cn.itsource.crm.query;

import cn.itsource.base.query.BaseQuery;

public class CustomerTraceHistoryQuery extends BaseQuery {
    private String date_range_start;
    private String date_range_end;

    public String getDate_range_start() {
        return date_range_start;
    }

    public void setDate_range_start(String date_range_start) {
        this.date_range_start = date_range_start;
    }

    public String getDate_range_end() {
        return date_range_end;
    }

    public void setDate_range_end(String date_range_end) {
        this.date_range_end = date_range_end;
    }
}
