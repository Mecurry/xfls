package com.ruoyi.system.service;

import com.ruoyi.system.domain.XfFireDetailed;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IXfFireDetailedService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public XfFireDetailed selectXfFireDetailedById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param xfFireDetailed 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<XfFireDetailed> selectXfFireDetailedList(XfFireDetailed xfFireDetailed);

    /**
     * 新增【请填写功能名称】
     * 
     * @param xfFireDetailed 【请填写功能名称】
     * @return 结果
     */
    public int insertXfFireDetailed(XfFireDetailed xfFireDetailed);

    /**
     * 修改【请填写功能名称】
     * 
     * @param xfFireDetailed 【请填写功能名称】
     * @return 结果
     */
    public int updateXfFireDetailed(XfFireDetailed xfFireDetailed);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteXfFireDetailedByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteXfFireDetailedById(String id);
}
