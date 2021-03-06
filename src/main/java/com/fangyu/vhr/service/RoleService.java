package com.fangyu.vhr.service;

import com.fangyu.vhr.mapper.RoleMapper;
import com.fangyu.vhr.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/22 2:24 下午
 */
@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public int addRole(Role role) {
        if (!role.getName().startsWith("ROLE_")) {
            role.setName("ROLE_" + role.getName());
        }
        return roleMapper.insert(role);
    }

    public int deleteRoleById(Integer rid) {
        return roleMapper.deleteByPrimaryKey(rid);
    }
}
