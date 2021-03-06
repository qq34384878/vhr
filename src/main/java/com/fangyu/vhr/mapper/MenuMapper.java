package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Menu;

import java.util.List;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer id);

    List<Menu> getAllMenusByWithRole();

    // 获取所有菜单
    List<Menu> getAllMenus();

    // 通过rid 查询Mid列表
    List<Integer> getMidsByRid(Integer rid);
}