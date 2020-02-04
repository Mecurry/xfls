package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JobMapper;
import com.ruoyi.system.domain.Job;
import com.ruoyi.system.service.IJobService;
import com.ruoyi.common.core.text.Convert;

/**
 * 定时任务调度Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class JobServiceImpl implements IJobService 
{
    @Autowired
    private JobMapper jobMapper;

    /**
     * 查询定时任务调度
     * 
     * @param jobId 定时任务调度ID
     * @return 定时任务调度
     */
    @Override
    public Job selectJobById(Long jobId)
    {
        return jobMapper.selectJobById(jobId);
    }

    /**
     * 查询定时任务调度列表
     * 
     * @param job 定时任务调度
     * @return 定时任务调度
     */
    @Override
    public List<Job> selectJobList(Job job)
    {
        return jobMapper.selectJobList(job);
    }

    /**
     * 新增定时任务调度
     * 
     * @param job 定时任务调度
     * @return 结果
     */
    @Override
    public int insertJob(Job job)
    {
        job.setCreateTime(DateUtils.getNowDate());
        return jobMapper.insertJob(job);
    }

    /**
     * 修改定时任务调度
     * 
     * @param job 定时任务调度
     * @return 结果
     */
    @Override
    public int updateJob(Job job)
    {
        job.setUpdateTime(DateUtils.getNowDate());
        return jobMapper.updateJob(job);
    }

    /**
     * 删除定时任务调度对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJobByIds(String ids)
    {
        return jobMapper.deleteJobByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除定时任务调度信息
     * 
     * @param jobId 定时任务调度ID
     * @return 结果
     */
    @Override
    public int deleteJobById(Long jobId)
    {
        return jobMapper.deleteJobById(jobId);
    }
}
