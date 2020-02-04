package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RoleDeptMapper;
import com.ruoyi.system.domain.RoleDept;
import com.ruoyi.system.service.IRoleDeptService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色和部门关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class RoleDeptServiceImpl implements IRoleDeptService 
{
    @Autowired
    private RoleDeptMapper roleDeptMapper;

    /**
     * 查询角色和部门关联
     * 
     * @param roleId 角色和部门关联ID
     * @return 角色和部门关联
     */
    @Override
    public RoleDept selectRoleDeptById(Long roleId)
    {
        return roleDeptMapper.selectRoleDeptById(roleId);
    }

    /**
     * 查询角色和部门关联列表
     * 
     * @param roleDept 角色和部门关联
     * @return 角色和部门关联
     */
    @Override
    public List<RoleDept> selectRoleDeptList(RoleDept roleDept)
    {
        return roleDeptMapper.selectRoleDeptList(roleDept);
    }

    /**
     * 新增角色和部门关联
     * 
     * @param roleDept 角色和部门关联
     * @return 结果
     */
    @Override
    public int insertRoleDept(RoleDept roleDept)
    {
        return roleDeptMapper.insertRoleDept(roleDept);
    }

    /**
     * 修改角色和部门关联
     * 
     * @param roleDept 角色和部门关联
     * @return 结果
     */
    @Override
    public int updateRoleDept(RoleDept roleDept)
    {
        return roleDeptMapper.updateRoleDept(roleDept);
    }

    /**
     * 删除角色和部门关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRoleDeptByIds(String ids)
    {
        return roleDeptMapper.deleteRoleDeptByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色和部门关联信息
     * 
     * @param roleId 角色和部门关联ID
     * @return 结果
     */
    @Override
    public int deleteRoleDeptById(Long roleId)
    {
        return roleDeptMapper.deleteRoleDeptById(roleId);
    }
}
