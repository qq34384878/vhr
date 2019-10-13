package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.EmployeeTrain;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeeTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);

    EmployeeTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeTrain record);

    int updateByPrimaryKey(EmployeeTrain record);
}