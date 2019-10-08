package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.HrRole;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);
}