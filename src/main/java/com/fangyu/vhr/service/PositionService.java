package com.fangyu.vhr.service;

import com.fangyu.vhr.mapper.PositionMapper;
import com.fangyu.vhr.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/10 7:05 下午
 */
@Service
public class PositionService {

    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPosition() {
        return positionMapper.getAllPosition();
    }

    public Integer addPosition(Position position) {
        position.setEnabled(true);
        position.setCreateDate(new Date());
        return positionMapper.insertSelective(position);
    }

    public Integer updatePosition(Position position) {
        return positionMapper.updateByPrimaryKeySelective(position);
    }

    public Integer deletePosition(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }
}
