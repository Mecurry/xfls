package com.ruoyi.system.service;

import com.ruoyi.system.domain.Job;
import java.util.List;

/**
 * 定时任务调度Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IJobService 
{
    /**
     * 查询定时任务调度
     * 
     * @param jobId 定时任务调度ID
     * @return 定时任务调度
     */
    public Job selectJobById(Long jobId);

    /**
     * 查询定时任务调度列表
     * 
     * @param job 定时任务调度
     * @return 定时任务调度集合
     */
    public List<Job> selectJobList(Job job);

    /**
     * 新增定时任务调度
     * 
     * @param job 定时任务调度
     * @return 结果
     */
    public int insertJob(Job job);

    /**
     * 修改定时任务调度
     * 
     * @param job 定时任务调度
     * @return 结果
     */
    public int updateJob(Job job);

    /**
     * 批量删除定时任务调度
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJobByIds(String ids);

    /**
     * 删除定时任务调度信息
     * 
     * @param jobId 定时任务调度ID
     * @return 结果
     */
    public int deleteJobById(Long jobId);
}
