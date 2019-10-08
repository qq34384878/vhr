package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Joblevel;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface JoblevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Joblevel record);

    int insertSelective(Joblevel record);

    Joblevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joblevel record);

    int updateByPrimaryKey(Joblevel record);
}