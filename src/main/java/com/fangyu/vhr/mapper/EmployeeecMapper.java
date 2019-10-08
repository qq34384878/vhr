package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Employeeec;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeeecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}