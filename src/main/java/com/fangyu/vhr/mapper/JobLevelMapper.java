package com.fangyu.vhr.mapper;

import com.fangyu.vhr.model.JobLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by fangyu on 2019/10/8.
 */
public interface JobLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobLevel record);

    int insertSelective(JobLevel record);

    JobLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobLevel record);

    int updateByPrimaryKey(JobLevel record);

    List<JobLevel> getAllJobLevels();

    Integer deleteJobLevelByIds(@Param("ids") Integer[] ids);
}