package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LogininforMapper;
import com.ruoyi.system.domain.Logininfor;
import com.ruoyi.system.service.ILogininforService;
import com.ruoyi.common.core.text.Convert;

/**
 * 系统访问记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class LogininforServiceImpl implements ILogininforService 
{
    @Autowired
    private LogininforMapper logininforMapper;

    /**
     * 查询系统访问记录
     * 
     * @param infoId 系统访问记录ID
     * @return 系统访问记录
     */
    @Override
    public Logininfor selectLogininforById(Long infoId)
    {
        return logininforMapper.selectLogininforById(infoId);
    }

    /**
     * 查询系统访问记录列表
     * 
     * @param logininfor 系统访问记录
     * @return 系统访问记录
     */
    @Override
    public List<Logininfor> selectLogininforList(Logininfor logininfor)
    {
        return logininforMapper.selectLogininforList(logininfor);
    }

    /**
     * 新增系统访问记录
     * 
     * @param logininfor 系统访问记录
     * @return 结果
     */
    @Override
    public int insertLogininfor(Logininfor logininfor)
    {
        return logininforMapper.insertLogininfor(logininfor);
    }

    /**
     * 修改系统访问记录
     * 
     * @param logininfor 系统访问记录
     * @return 结果
     */
    @Override
    public int updateLogininfor(Logininfor logininfor)
    {
        return logininforMapper.updateLogininfor(logininfor);
    }

    /**
     * 删除系统访问记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLogininforByIds(String ids)
    {
        return logininforMapper.deleteLogininforByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除系统访问记录信息
     * 
     * @param infoId 系统访问记录ID
     * @return 结果
     */
    @Override
    public int deleteLogininforById(Long infoId)
    {
        return logininforMapper.deleteLogininforById(infoId);
    }
}
