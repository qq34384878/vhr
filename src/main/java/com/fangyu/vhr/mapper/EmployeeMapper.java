package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Employee;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}