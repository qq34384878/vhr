package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Oplog;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface OplogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oplog record);

    int insertSelective(Oplog record);

    Oplog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oplog record);

    int updateByPrimaryKey(Oplog record);
}