package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Role;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}