package com.ruoyi.system.service;

import com.ruoyi.system.domain.RoleMenu;
import java.util.List;

/**
 * 角色和菜单关联Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IRoleMenuService 
{
    /**
     * 查询角色和菜单关联
     * 
     * @param roleId 角色和菜单关联ID
     * @return 角色和菜单关联
     */
    public RoleMenu selectRoleMenuById(Long roleId);

    /**
     * 查询角色和菜单关联列表
     * 
     * @param roleMenu 角色和菜单关联
     * @return 角色和菜单关联集合
     */
    public List<RoleMenu> selectRoleMenuList(RoleMenu roleMenu);

    /**
     * 新增角色和菜单关联
     * 
     * @param roleMenu 角色和菜单关联
     * @return 结果
     */
    public int insertRoleMenu(RoleMenu roleMenu);

    /**
     * 修改角色和菜单关联
     * 
     * @param roleMenu 角色和菜单关联
     * @return 结果
     */
    public int updateRoleMenu(RoleMenu roleMenu);

    /**
     * 批量删除角色和菜单关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleMenuByIds(String ids);

    /**
     * 删除角色和菜单关联信息
     * 
     * @param roleId 角色和菜单关联ID
     * @return 结果
     */
    public int deleteRoleMenuById(Long roleId);
}
