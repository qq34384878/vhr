package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Empsalary;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmpsalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Empsalary record);

    int insertSelective(Empsalary record);

    Empsalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Empsalary record);

    int updateByPrimaryKey(Empsalary record);
}