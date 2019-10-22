package com.fangyu.vhr.service;

import com.fangyu.vhr.mapper.DepartmentMapper;
import com.fangyu.vhr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/22 9:38 下午
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAllDepartment() {
        return departmentMapper.getAllDepartmentByParentId(-1);
    }
}
