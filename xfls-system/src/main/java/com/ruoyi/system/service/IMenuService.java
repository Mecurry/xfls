package com.ruoyi.system.service;

import com.ruoyi.system.domain.Menu;
import java.util.List;

/**
 * 菜单权限Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IMenuService 
{
    /**
     * 查询菜单权限
     * 
     * @param menuId 菜单权限ID
     * @return 菜单权限
     */
    public Menu selectMenuById(Long menuId);

    /**
     * 查询菜单权限列表
     * 
     * @param menu 菜单权限
     * @return 菜单权限集合
     */
    public List<Menu> selectMenuList(Menu menu);

    /**
     * 新增菜单权限
     * 
     * @param menu 菜单权限
     * @return 结果
     */
    public int insertMenu(Menu menu);

    /**
     * 修改菜单权限
     * 
     * @param menu 菜单权限
     * @return 结果
     */
    public int updateMenu(Menu menu);

    /**
     * 批量删除菜单权限
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMenuByIds(String ids);

    /**
     * 删除菜单权限信息
     * 
     * @param menuId 菜单权限ID
     * @return 结果
     */
    public int deleteMenuById(Long menuId);
}
