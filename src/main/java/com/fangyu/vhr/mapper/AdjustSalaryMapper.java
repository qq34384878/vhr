package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.AdjustSalary;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface AdjustSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdjustSalary record);

    int insertSelective(AdjustSalary record);

    AdjustSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdjustSalary record);

    int updateByPrimaryKey(AdjustSalary record);
}