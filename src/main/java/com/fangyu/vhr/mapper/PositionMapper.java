package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.Position;

import java.util.List;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<Position> getAllPosition();
}