package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.SysMsg;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface SysMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    SysMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
}