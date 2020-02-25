package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.XfFireManager;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 【火灾信息列表】Mapper接口
 * 
 * @author yanye
 * @date 2020-02-05
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
     * 查询列表（根据日期排序_DESC降序）
     *
     * @param xfFireManager
     * @return
     */
//    @Select("select * from xf_fire_manager xfm ORDER BY xfm.fire_date DESC")
//    @Select("select * from xf_fire_manager xfm   WHERE xfm.fire_date>='2019-01-01' ORDER BY xfm.fire_date DESC  ")
    public List<XfFireManager> selectXfFireManagerListOrderByDATE(XfFireManager xfFireManager);

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

    public List<XfFireManager> getStatisticsList(Map<String, Object> map);

    /**
     * 根据年查询当前当前火灾分布数据（默认为当年年份查询）
     * @param fireDate
     * @return
     */
    public List<XfFireManager> selectXfFireManagerListByYear(String fireDate);
}
