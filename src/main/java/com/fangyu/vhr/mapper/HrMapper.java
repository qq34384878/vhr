package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Hr;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);
}