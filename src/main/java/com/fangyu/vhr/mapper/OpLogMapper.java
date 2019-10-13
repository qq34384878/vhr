package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.OpLog;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
}