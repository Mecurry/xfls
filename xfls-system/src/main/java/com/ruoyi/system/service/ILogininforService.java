package com.ruoyi.system.service;

import com.ruoyi.system.domain.Logininfor;
import java.util.List;

/**
 * 系统访问记录Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface ILogininforService 
{
    /**
     * 查询系统访问记录
     * 
     * @param infoId 系统访问记录ID
     * @return 系统访问记录
     */
    public Logininfor selectLogininforById(Long infoId);

    /**
     * 查询系统访问记录列表
     * 
     * @param logininfor 系统访问记录
     * @return 系统访问记录集合
     */
    public List<Logininfor> selectLogininforList(Logininfor logininfor);

    /**
     * 新增系统访问记录
     * 
     * @param logininfor 系统访问记录
     * @return 结果
     */
    public int insertLogininfor(Logininfor logininfor);

    /**
     * 修改系统访问记录
     * 
     * @param logininfor 系统访问记录
     * @return 结果
     */
    public int updateLogininfor(Logininfor logininfor);

    /**
     * 批量删除系统访问记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLogininforByIds(String ids);

    /**
     * 删除系统访问记录信息
     * 
     * @param infoId 系统访问记录ID
     * @return 结果
     */
    public int deleteLogininforById(Long infoId);
}
