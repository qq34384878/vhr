package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Department;

import java.util.List;

/**
 *
 * @author fangyu
 * @date 2019/10/8
 */
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> getAllDepartmentByParentId(Integer pid);
}