package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Salary;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);
}