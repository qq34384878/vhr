package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Sysmsg;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface SysmsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sysmsg record);

    int insertSelective(Sysmsg record);

    Sysmsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sysmsg record);

    int updateByPrimaryKey(Sysmsg record);
}