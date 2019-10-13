package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.EmployeeEc;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeeEcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeEc record);

    int insertSelective(EmployeeEc record);

    EmployeeEc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeEc record);

    int updateByPrimaryKey(EmployeeEc record);
}