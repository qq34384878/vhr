package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Employeeremove;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeeremoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    int insertSelective(Employeeremove record);

    Employeeremove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeremove record);

    int updateByPrimaryKey(Employeeremove record);
}