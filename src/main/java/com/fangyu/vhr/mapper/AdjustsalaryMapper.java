package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Adjustsalary;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface AdjustsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Adjustsalary record);

    int insertSelective(Adjustsalary record);

    Adjustsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adjustsalary record);

    int updateByPrimaryKey(Adjustsalary record);
}