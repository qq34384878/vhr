package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Menu;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}