package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Appraise;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface AppraiseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appraise record);

    int insertSelective(Appraise record);

    Appraise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Appraise record);

    int updateByPrimaryKey(Appraise record);
}