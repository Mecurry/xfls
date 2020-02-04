package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MenuMapper;
import com.ruoyi.system.domain.Menu;
import com.ruoyi.system.service.IMenuService;
import com.ruoyi.common.core.text.Convert;

/**
 * 菜单权限Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class MenuServiceImpl implements IMenuService 
{
    @Autowired
    private MenuMapper menuMapper;

    /**
     * 查询菜单权限
     * 
     * @param menuId 菜单权限ID
     * @return 菜单权限
     */
    @Override
    public Menu selectMenuById(Long menuId)
    {
        return menuMapper.selectMenuById(menuId);
    }

    /**
     * 查询菜单权限列表
     * 
     * @param menu 菜单权限
     * @return 菜单权限
     */
    @Override
    public List<Menu> selectMenuList(Menu menu)
    {
        return menuMapper.selectMenuList(menu);
    }

    /**
     * 新增菜单权限
     * 
     * @param menu 菜单权限
     * @return 结果
     */
    @Override
    public int insertMenu(Menu menu)
    {
        menu.setCreateTime(DateUtils.getNowDate());
        return menuMapper.insertMenu(menu);
    }

    /**
     * 修改菜单权限
     * 
     * @param menu 菜单权限
     * @return 结果
     */
    @Override
    public int updateMenu(Menu menu)
    {
        menu.setUpdateTime(DateUtils.getNowDate());
        return menuMapper.updateMenu(menu);
    }

    /**
     * 删除菜单权限对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMenuByIds(String ids)
    {
        return menuMapper.deleteMenuByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除菜单权限信息
     * 
     * @param menuId 菜单权限ID
     * @return 结果
     */
    @Override
    public int deleteMenuById(Long menuId)
    {
        return menuMapper.deleteMenuById(menuId);
    }
}
