package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Nation;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);
}