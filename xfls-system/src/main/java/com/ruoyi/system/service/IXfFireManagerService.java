package com.ruoyi.system.service;

import com.ruoyi.system.domain.XfFireManager;
import java.util.List;
import java.util.Map;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author yanye
 * @date 2020-02-05
 */
public interface IXfFireManagerService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public XfFireManager selectXfFireManagerById(String id);

    /**
     * 查询列表
     * 
     * @param xfFireManager
     * @return
     */
    public List<XfFireManager> selectXfFireManagerList(XfFireManager xfFireManager);

    /**
     * 新增【请填写功能名称】
     * 
     * @param xfFireManager 【请填写功能名称】
     * @return 结果
     */
    public int insertXfFireManager(XfFireManager xfFireManager);

    /**
     * 修改【请填写功能名称】
     * 
     * @param xfFireManager 【请填写功能名称】
     * @return 结果
     */
    public int updateXfFireManager(XfFireManager xfFireManager);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteXfFireManagerByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteXfFireManagerById(String id);
    public List<XfFireManager> getStatisticsList(Map<String,Object> map);
}
