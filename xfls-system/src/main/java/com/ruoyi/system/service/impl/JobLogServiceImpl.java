package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.JobLogMapper;
import com.ruoyi.system.domain.JobLog;
import com.ruoyi.system.service.IJobLogService;
import com.ruoyi.common.core.text.Convert;

/**
 * 定时任务调度日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class JobLogServiceImpl implements IJobLogService 
{
    @Autowired
    private JobLogMapper jobLogMapper;

    /**
     * 查询定时任务调度日志
     * 
     * @param jobLogId 定时任务调度日志ID
     * @return 定时任务调度日志
     */
    @Override
    public JobLog selectJobLogById(Long jobLogId)
    {
        return jobLogMapper.selectJobLogById(jobLogId);
    }

    /**
     * 查询定时任务调度日志列表
     * 
     * @param jobLog 定时任务调度日志
     * @return 定时任务调度日志
     */
    @Override
    public List<JobLog> selectJobLogList(JobLog jobLog)
    {
        return jobLogMapper.selectJobLogList(jobLog);
    }

    /**
     * 新增定时任务调度日志
     * 
     * @param jobLog 定时任务调度日志
     * @return 结果
     */
    @Override
    public int insertJobLog(JobLog jobLog)
    {
        jobLog.setCreateTime(DateUtils.getNowDate());
        return jobLogMapper.insertJobLog(jobLog);
    }

    /**
     * 修改定时任务调度日志
     * 
     * @param jobLog 定时任务调度日志
     * @return 结果
     */
    @Override
    public int updateJobLog(JobLog jobLog)
    {
        return jobLogMapper.updateJobLog(jobLog);
    }

    /**
     * 删除定时任务调度日志对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJobLogByIds(String ids)
    {
        return jobLogMapper.deleteJobLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除定时任务调度日志信息
     * 
     * @param jobLogId 定时任务调度日志ID
     * @return 结果
     */
    @Override
    public int deleteJobLogById(Long jobLogId)
    {
        return jobLogMapper.deleteJobLogById(jobLogId);
    }
}
