package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Politicsstatus;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface PoliticsstatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    int insertSelective(Politicsstatus record);

    Politicsstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Politicsstatus record);

    int updateByPrimaryKey(Politicsstatus record);
}