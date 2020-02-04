package com.ruoyi.system.service;

import com.ruoyi.system.domain.Config;
import java.util.List;

/**
 * 参数配置Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IConfigService 
{
    /**
     * 查询参数配置
     * 
     * @param configId 参数配置ID
     * @return 参数配置
     */
    public Config selectConfigById(Integer configId);

    /**
     * 查询参数配置列表
     * 
     * @param config 参数配置
     * @return 参数配置集合
     */
    public List<Config> selectConfigList(Config config);

    /**
     * 新增参数配置
     * 
     * @param config 参数配置
     * @return 结果
     */
    public int insertConfig(Config config);

    /**
     * 修改参数配置
     * 
     * @param config 参数配置
     * @return 结果
     */
    public int updateConfig(Config config);

    /**
     * 批量删除参数配置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteConfigByIds(String ids);

    /**
     * 删除参数配置信息
     * 
     * @param configId 参数配置ID
     * @return 结果
     */
    public int deleteConfigById(Integer configId);
}
