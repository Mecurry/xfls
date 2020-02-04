package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Dept;
import java.util.List;

/**
 * 部门Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface DeptMapper 
{
    /**
     * 查询部门
     * 
     * @param deptId 部门ID
     * @return 部门
     */
    public Dept selectDeptById(Long deptId);

    /**
     * 查询部门列表
     * 
     * @param dept 部门
     * @return 部门集合
     */
    public List<Dept> selectDeptList(Dept dept);

    /**
     * 新增部门
     * 
     * @param dept 部门
     * @return 结果
     */
    public int insertDept(Dept dept);

    /**
     * 修改部门
     * 
     * @param dept 部门
     * @return 结果
     */
    public int updateDept(Dept dept);

    /**
     * 删除部门
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    public int deleteDeptById(Long deptId);

    /**
     * 批量删除部门
     * 
     * @param deptIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteDeptByIds(String[] deptIds);
}
