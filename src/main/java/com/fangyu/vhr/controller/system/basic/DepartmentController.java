package com.fangyu.vhr.controller.system.basic;

import com.fangyu.vhr.model.Department;
import com.fangyu.vhr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/22 9:35 下午
 */
@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }
}
