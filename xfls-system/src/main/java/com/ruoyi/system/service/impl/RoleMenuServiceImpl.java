package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RoleMenuMapper;
import com.ruoyi.system.domain.RoleMenu;
import com.ruoyi.system.service.IRoleMenuService;
import com.ruoyi.common.core.text.Convert;

/**
 * 角色和菜单关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class RoleMenuServiceImpl implements IRoleMenuService 
{
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    /**
     * 查询角色和菜单关联
     * 
     * @param roleId 角色和菜单关联ID
     * @return 角色和菜单关联
     */
    @Override
    public RoleMenu selectRoleMenuById(Long roleId)
    {
        return roleMenuMapper.selectRoleMenuById(roleId);
    }

    /**
     * 查询角色和菜单关联列表
     * 
     * @param roleMenu 角色和菜单关联
     * @return 角色和菜单关联
     */
    @Override
    public List<RoleMenu> selectRoleMenuList(RoleMenu roleMenu)
    {
        return roleMenuMapper.selectRoleMenuList(roleMenu);
    }

    /**
     * 新增角色和菜单关联
     * 
     * @param roleMenu 角色和菜单关联
     * @return 结果
     */
    @Override
    public int insertRoleMenu(RoleMenu roleMenu)
    {
        return roleMenuMapper.insertRoleMenu(roleMenu);
    }

    /**
     * 修改角色和菜单关联
     * 
     * @param roleMenu 角色和菜单关联
     * @return 结果
     */
    @Override
    public int updateRoleMenu(RoleMenu roleMenu)
    {
        return roleMenuMapper.updateRoleMenu(roleMenu);
    }

    /**
     * 删除角色和菜单关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRoleMenuByIds(String ids)
    {
        return roleMenuMapper.deleteRoleMenuByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除角色和菜单关联信息
     * 
     * @param roleId 角色和菜单关联ID
     * @return 结果
     */
    @Override
    public int deleteRoleMenuById(Long roleId)
    {
        return roleMenuMapper.deleteRoleMenuById(roleId);
    }
}
