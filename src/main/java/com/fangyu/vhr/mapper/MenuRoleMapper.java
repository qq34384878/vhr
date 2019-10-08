package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.MenuRole;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface MenuRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRole record);

    int insertSelective(MenuRole record);

    MenuRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRole record);

    int updateByPrimaryKey(MenuRole record);
}