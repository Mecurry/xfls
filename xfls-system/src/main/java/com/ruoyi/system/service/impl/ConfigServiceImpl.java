package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ConfigMapper;
import com.ruoyi.system.domain.Config;
import com.ruoyi.system.service.IConfigService;
import com.ruoyi.common.core.text.Convert;

/**
 * 参数配置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class ConfigServiceImpl implements IConfigService 
{
    @Autowired
    private ConfigMapper configMapper;

    /**
     * 查询参数配置
     * 
     * @param configId 参数配置ID
     * @return 参数配置
     */
    @Override
    public Config selectConfigById(Integer configId)
    {
        return configMapper.selectConfigById(configId);
    }

    /**
     * 查询参数配置列表
     * 
     * @param config 参数配置
     * @return 参数配置
     */
    @Override
    public List<Config> selectConfigList(Config config)
    {
        return configMapper.selectConfigList(config);
    }

    /**
     * 新增参数配置
     * 
     * @param config 参数配置
     * @return 结果
     */
    @Override
    public int insertConfig(Config config)
    {
        config.setCreateTime(DateUtils.getNowDate());
        return configMapper.insertConfig(config);
    }

    /**
     * 修改参数配置
     * 
     * @param config 参数配置
     * @return 结果
     */
    @Override
    public int updateConfig(Config config)
    {
        config.setUpdateTime(DateUtils.getNowDate());
        return configMapper.updateConfig(config);
    }

    /**
     * 删除参数配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteConfigByIds(String ids)
    {
        return configMapper.deleteConfigByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除参数配置信息
     * 
     * @param configId 参数配置ID
     * @return 结果
     */
    @Override
    public int deleteConfigById(Integer configId)
    {
        return configMapper.deleteConfigById(configId);
    }
}
