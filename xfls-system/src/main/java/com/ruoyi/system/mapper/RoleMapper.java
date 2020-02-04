package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Role;
import java.util.List;

/**
 * 角色信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface RoleMapper 
{
    /**
     * 查询角色信息
     * 
     * @param roleId 角色信息ID
     * @return 角色信息
     */
    public Role selectRoleById(Long roleId);

    /**
     * 查询角色信息列表
     * 
     * @param role 角色信息
     * @return 角色信息集合
     */
    public List<Role> selectRoleList(Role role);

    /**
     * 新增角色信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    public int insertRole(Role role);

    /**
     * 修改角色信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    public int updateRole(Role role);

    /**
     * 删除角色信息
     * 
     * @param roleId 角色信息ID
     * @return 结果
     */
    public int deleteRoleById(Long roleId);

    /**
     * 批量删除角色信息
     * 
     * @param roleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleByIds(String[] roleIds);
}
