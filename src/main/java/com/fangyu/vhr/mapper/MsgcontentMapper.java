package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Msgcontent;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface MsgcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msgcontent record);

    int insertSelective(Msgcontent record);

    Msgcontent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msgcontent record);

    int updateByPrimaryKey(Msgcontent record);
}