package cn.itsource.base.service;

import cn.itsource.base.query.BaseQuery;
import cn.itsource.base.util.PageResult;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T, ID extends Serializable> {
    void save(T t);

    void delete(ID id);

    void update(T t);

    T selectById(ID id);

    /**
     * 通过sn来查询实体,目前用在查找数据字典及数据字典明细
     *
     * @param sn
     * @return
     */
    T selectBySn(ID sn);

    List<T> selectAll();

    /**
     * 查询列表根据查询条件
     *
     * @param baseQuery
     * @return
     */
    List<T> selectByQuery(BaseQuery baseQuery);

    /**
     * 查询分页列表根据查询条件
     *
     * @param baseQuery
     * @return
     */
    PageResult<T> selectPageByQuery(BaseQuery baseQuery);


    void batchDelete(List<T> list);

    List<String> selectName();
}
