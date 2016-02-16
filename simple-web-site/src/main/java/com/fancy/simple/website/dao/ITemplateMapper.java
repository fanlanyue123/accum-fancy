package com.fancy.simple.website.dao;

import java.io.Serializable;

/**
 * Created by fancy on 2015/6/17.
 * 模版 ps: 利用mybatis-gen 自动生成sql 进行基础的增删改查
 */
public interface ITemplateMapper<T> extends Serializable {

    /**
     * @param primaryKey
     * @return int
     * @Description: 根据主键删去记录
     */
    int deleteByPrimaryKey(Serializable primaryKey);

    /**
     * @param entity
     * @return int
     * @Description: 插入实体类
     */
    int insert(T entity);

    /**
     * @param entity
     * @return int
     * @Description: 插入可选属性实体类
     */
    int insertSelective(T entity);

    /**
     * @param primaryKey
     * @return SerializeUtil
     * @Description: 根据主键查找记录
     */
    T selectByPrimaryKey(Serializable primaryKey);

    /**
     * @param entity
     * @return int
     * @Description: 根据主键更新可选实体类
     */
    int updateByPrimaryKeySelective(T entity);

    /**
     * @param entity
     * @return int
     * @Description: 根据主键更新实体
     */
    int updateByPrimaryKey(T entity);
}
