package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Employeetrain;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeetrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    int insertSelective(Employeetrain record);

    Employeetrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeetrain record);

    int updateByPrimaryKey(Employeetrain record);
}