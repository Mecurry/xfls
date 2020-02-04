package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DeptMapper;
import com.ruoyi.system.domain.Dept;
import com.ruoyi.system.service.IDeptService;
import com.ruoyi.common.core.text.Convert;

/**
 * 部门Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class DeptServiceImpl implements IDeptService 
{
    @Autowired
    private DeptMapper deptMapper;

    /**
     * 查询部门
     * 
     * @param deptId 部门ID
     * @return 部门
     */
    @Override
    public Dept selectDeptById(Long deptId)
    {
        return deptMapper.selectDeptById(deptId);
    }

    /**
     * 查询部门列表
     * 
     * @param dept 部门
     * @return 部门
     */
    @Override
    public List<Dept> selectDeptList(Dept dept)
    {
        return deptMapper.selectDeptList(dept);
    }

    /**
     * 新增部门
     * 
     * @param dept 部门
     * @return 结果
     */
    @Override
    public int insertDept(Dept dept)
    {
        dept.setCreateTime(DateUtils.getNowDate());
        return deptMapper.insertDept(dept);
    }

    /**
     * 修改部门
     * 
     * @param dept 部门
     * @return 结果
     */
    @Override
    public int updateDept(Dept dept)
    {
        dept.setUpdateTime(DateUtils.getNowDate());
        return deptMapper.updateDept(dept);
    }

    /**
     * 删除部门对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDeptByIds(String ids)
    {
        return deptMapper.deleteDeptByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除部门信息
     * 
     * @param deptId 部门ID
     * @return 结果
     */
    @Override
    public int deleteDeptById(Long deptId)
    {
        return deptMapper.deleteDeptById(deptId);
    }
}
