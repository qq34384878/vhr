package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.MsgContent;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface MsgContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgContent record);

    int insertSelective(MsgContent record);

    MsgContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgContent record);

    int updateByPrimaryKey(MsgContent record);
}