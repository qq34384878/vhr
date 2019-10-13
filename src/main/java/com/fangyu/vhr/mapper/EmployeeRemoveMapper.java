package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.EmployeeRemove;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface EmployeeRemoveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeRemove record);

    int insertSelective(EmployeeRemove record);

    EmployeeRemove selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeRemove record);

    int updateByPrimaryKey(EmployeeRemove record);
}