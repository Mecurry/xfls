package com.ruoyi.system.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ruoyi.system.mapper.XfFireManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.XfFireManager;
import com.ruoyi.system.service.IXfFireManagerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author yanye
 * @date 2020-02-05
 */
@Service
public class XfFireManagerServiceImpl implements IXfFireManagerService 
{
    @Autowired
    private XfFireManagerMapper xfFireManagerMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public XfFireManager selectXfFireManagerById(String id)
    {
        return xfFireManagerMapper.selectXfFireManagerById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param xfFireManager 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<XfFireManager> selectXfFireManagerList(XfFireManager xfFireManager)
    {
        return xfFireManagerMapper.selectXfFireManagerList(xfFireManager);
    }

    /**
     * 查询列表【根据日期排序DESC】
     * @param xfFireManager
     * @return
     */
    @Override
    public List<XfFireManager> selectXfFireManagerListOrderByDATE(XfFireManager xfFireManager) {
        return xfFireManagerMapper.selectXfFireManagerListOrderByDATE(xfFireManager);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param xfFireManager 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertXfFireManager(XfFireManager xfFireManager)
    {
        return xfFireManagerMapper.insertXfFireManager(xfFireManager);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param xfFireManager 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateXfFireManager(XfFireManager xfFireManager)
    {
        return xfFireManagerMapper.updateXfFireManager(xfFireManager);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteXfFireManagerByIds(String ids)
    {
        return xfFireManagerMapper.deleteXfFireManagerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteXfFireManagerById(String id)
    {
        return xfFireManagerMapper.deleteXfFireManagerById(id);
    }

    @Override
    public List<XfFireManager> getStatisticsList(Map<String, Object> map) {
        return xfFireManagerMapper.getStatisticsList(map);
    }

    /**
     * 根据年查询坐标数据
     * @param fireDate
     * @return
     */
    @Override
    public List<XfFireManager> selectXfFireManagerListByYear(String fireDate) {
        System.out.println("年份1"+fireDate);
        if(fireDate == null || fireDate.isEmpty() || fireDate == "" ){
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy");
            fireDate = ft.format(new Date());
        }
        System.out.println("年份2"+fireDate);
        return xfFireManagerMapper.selectXfFireManagerListByYear(fireDate);
    }
}
