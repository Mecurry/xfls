package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.OperLog;
import java.util.List;

/**
 * 操作日志记录Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface OperLogMapper 
{
    /**
     * 查询操作日志记录
     * 
     * @param operId 操作日志记录ID
     * @return 操作日志记录
     */
    public OperLog selectOperLogById(Long operId);

    /**
     * 查询操作日志记录列表
     * 
     * @param operLog 操作日志记录
     * @return 操作日志记录集合
     */
    public List<OperLog> selectOperLogList(OperLog operLog);

    /**
     * 新增操作日志记录
     * 
     * @param operLog 操作日志记录
     * @return 结果
     */
    public int insertOperLog(OperLog operLog);

    /**
     * 修改操作日志记录
     * 
     * @param operLog 操作日志记录
     * @return 结果
     */
    public int updateOperLog(OperLog operLog);

    /**
     * 删除操作日志记录
     * 
     * @param operId 操作日志记录ID
     * @return 结果
     */
    public int deleteOperLogById(Long operId);

    /**
     * 批量删除操作日志记录
     * 
     * @param operIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOperLogByIds(String[] operIds);
}