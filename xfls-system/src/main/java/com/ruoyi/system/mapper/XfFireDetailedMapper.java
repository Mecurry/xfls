package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.XfFireDetailed;
import java.util.List;

/**
 * 【火灾详细信息】Mapper接口
 * 
 * @author yanye
 * @date 2020-02-05
 */
public interface XfFireDetailedMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteXfFireDetailedById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteXfFireDetailedByIds(String[] ids);
}
