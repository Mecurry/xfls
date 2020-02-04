package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OperLogMapper;
import com.ruoyi.system.domain.OperLog;
import com.ruoyi.system.service.IOperLogService;
import com.ruoyi.common.core.text.Convert;

/**
 * 操作日志记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class OperLogServiceImpl implements IOperLogService 
{
    @Autowired
    private OperLogMapper operLogMapper;

    /**
     * 查询操作日志记录
     * 
     * @param operId 操作日志记录ID
     * @return 操作日志记录
     */
    @Override
    public OperLog selectOperLogById(Long operId)
    {
        return operLogMapper.selectOperLogById(operId);
    }

    /**
     * 查询操作日志记录列表
     * 
     * @param operLog 操作日志记录
     * @return 操作日志记录
     */
    @Override
    public List<OperLog> selectOperLogList(OperLog operLog)
    {
        return operLogMapper.selectOperLogList(operLog);
    }

    /**
     * 新增操作日志记录
     * 
     * @param operLog 操作日志记录
     * @return 结果
     */
    @Override
    public int insertOperLog(OperLog operLog)
    {
        return operLogMapper.insertOperLog(operLog);
    }

    /**
     * 修改操作日志记录
     * 
     * @param operLog 操作日志记录
     * @return 结果
     */
    @Override
    public int updateOperLog(OperLog operLog)
    {
        return operLogMapper.updateOperLog(operLog);
    }

    /**
     * 删除操作日志记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOperLogByIds(String ids)
    {
        return operLogMapper.deleteOperLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除操作日志记录信息
     * 
     * @param operId 操作日志记录ID
     * @return 结果
     */
    @Override
    public int deleteOperLogById(Long operId)
    {
        return operLogMapper.deleteOperLogById(operId);
    }
}
