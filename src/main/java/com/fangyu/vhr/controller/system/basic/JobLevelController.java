package com.fangyu.vhr.controller.system.basic;

import com.fangyu.vhr.model.JobLevel;
import com.fangyu.vhr.model.RespBean;
import com.fangyu.vhr.service.JobLevelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fangyu
 * @version v1.0.0
 * @since 2019/10/13 9:13 下午
 */

@Slf4j
@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {

    @Autowired
    JobLevelService jobLevelService;

    @GetMapping("/")
    public List<JobLevel> getAllJobLevels(){
        List<JobLevel> jobLevels = jobLevelService.getAllJobLevels();
        log.info("job ==> {}",jobLevels);
        return jobLevels;
    }

    @PostMapping("/")
    public RespBean addJobLevel(JobLevel jobLevel){
        if(jobLevelService.addJobLevel(jobLevel) == 1){
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @PutMapping("/")
    public RespBean updateJobLevel(@RequestBody JobLevel jobLevel){
        if (jobLevelService.updateJobLevel(jobLevel) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }

    @DeleteMapping("/")
    public RespBean deleteJobLevelById(Integer id){
        if (jobLevelService.deleteJobLevelById(id) == 1){
            return RespBean.ok("删除成功!");
        }
        return RespBean.error("删除失败!");
    }
}
