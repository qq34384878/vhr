package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.EmpSalary;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmpSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);

    EmpSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpSalary record);

    int updateByPrimaryKey(EmpSalary record);
}