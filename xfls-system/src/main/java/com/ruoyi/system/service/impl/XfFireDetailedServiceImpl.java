package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.XfFireDetailedMapper;
import com.ruoyi.system.domain.XfFireDetailed;
import com.ruoyi.system.service.IXfFireDetailedService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class XfFireDetailedServiceImpl implements IXfFireDetailedService 
{
    @Autowired
    private XfFireDetailedMapper xfFireDetailedMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public XfFireDetailed selectXfFireDetailedById(String id)
    {
        return xfFireDetailedMapper.selectXfFireDetailedById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param xfFireDetailed 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<XfFireDetailed> selectXfFireDetailedList(XfFireDetailed xfFireDetailed)
    {
        return xfFireDetailedMapper.selectXfFireDetailedList(xfFireDetailed);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param xfFireDetailed 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertXfFireDetailed(XfFireDetailed xfFireDetailed)
    {
        return xfFireDetailedMapper.insertXfFireDetailed(xfFireDetailed);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param xfFireDetailed 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateXfFireDetailed(XfFireDetailed xfFireDetailed)
    {
        return xfFireDetailedMapper.updateXfFireDetailed(xfFireDetailed);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteXfFireDetailedByIds(String ids)
    {
        return xfFireDetailedMapper.deleteXfFireDetailedByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteXfFireDetailedById(String id)
    {
        return xfFireDetailedMapper.deleteXfFireDetailedById(id);
    }
}
