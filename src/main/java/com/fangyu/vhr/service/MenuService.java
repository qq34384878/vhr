package com.fangyu.vhr.service;

import com.fangyu.vhr.mapper.MenuMapper;
import com.fangyu.vhr.model.Hr;
import com.fangyu.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/9 1:56 上午
 */
@Service
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    // 通过HRId查询菜单
    public List<Menu> getMenuByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    // 通过角色查询所有菜单
//    @Cacheable    // 缓存
    public List<Menu> getAllMenusByWithRole() {
        return menuMapper.getAllMenusByWithRole();
    }

    // 获取所有菜单
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }
}
