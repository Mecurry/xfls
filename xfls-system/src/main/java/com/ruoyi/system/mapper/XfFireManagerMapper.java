package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.XfFireManager;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface XfFireManagerMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public XfFireManager selectXfFireManagerById(String id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param xfFireManager 【请填写功能名称】
     * @return 【请填写功能名称】集合
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
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteXfFireManagerById(String id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteXfFireManagerByIds(String[] ids);
}