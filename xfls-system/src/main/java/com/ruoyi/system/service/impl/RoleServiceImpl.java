package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RoleMapper;
import com.ruoyi.system.domain.Role;
import com.ruoyi.system.service.IRoleService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class RoleServiceImpl implements IRoleService 
{
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询角色信息
     * 
     * @param roleId 角色信息ID
     * @return 角色信息
     */
    @Override
    public Role selectRoleById(Long roleId)
    {
        return roleMapper.selectRoleById(roleId);
    }

    /**
     * 查询角色信息列表
     * 
     * @param role 角色信息
     * @return 角色信息
     */
    @Override
    public List<Role> selectRoleList(Role role)
    {
        return roleMapper.selectRoleList(role);
    }

    /**
     * 新增角色信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    public int insertRole(Role role)
    {
        role.setCreateTime(DateUtils.getNowDate());
        return roleMapper.insertRole(role);
    }

    /**
     * 修改角色信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    public int updateRole(Role role)
    {
        role.setUpdateTime(DateUtils.getNowDate());
        return roleMapper.updateRole(role);
    }

    /**
     * 删除角色信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRoleByIds(String ids)
    {
        return roleMapper.deleteRoleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色信息信息
     * 
     * @param roleId 角色信息ID
     * @return 结果
     */
    @Override
    public int deleteRoleById(Long roleId)
    {
        return roleMapper.deleteRoleById(roleId);
    }
}
