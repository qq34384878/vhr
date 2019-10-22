package com.fangyu.vhr.controller.system.basic;

import com.fangyu.vhr.model.Menu;
import com.fangyu.vhr.model.RespBean;
import com.fangyu.vhr.model.Role;
import com.fangyu.vhr.service.MenuService;
import com.fangyu.vhr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/22 2:22 下午
 */
@RestController
@RequestMapping("/system/basic/permiss")
public class PermissController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("/menus")
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/mids/{rid}")
    public List<Integer> getMidsByRid(@PathVariable Integer rid){
        return menuService.getMidsByRid(rid);
    }

    @PutMapping("/")
    public RespBean updateMenuRole(Integer rid, Integer[] mids){
        if (menuService.updateMenuRole(rid, mids)){
            return RespBean.ok("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
