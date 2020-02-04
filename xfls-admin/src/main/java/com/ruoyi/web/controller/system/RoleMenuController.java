package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.RoleMenu;
import com.ruoyi.system.service.IRoleMenuService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 角色和菜单关联Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/menu")
public class RoleMenuController extends BaseController
{
    private String prefix = "system/menu";

    @Autowired
    private IRoleMenuService roleMenuService;

    @RequiresPermissions("system:menu:view")
    @GetMapping()
    public String menu()
    {
        return prefix + "/menu";
    }

    /**
     * 查询角色和菜单关联列表
     */
    @RequiresPermissions("system:menu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RoleMenu roleMenu)
    {
        startPage();
        List<RoleMenu> list = roleMenuService.selectRoleMenuList(roleMenu);
        return getDataTable(list);
    }

    /**
     * 导出角色和菜单关联列表
     */
    @RequiresPermissions("system:menu:export")
    @Log(title = "角色和菜单关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RoleMenu roleMenu)
    {
        List<RoleMenu> list = roleMenuService.selectRoleMenuList(roleMenu);
        ExcelUtil<RoleMenu> util = new ExcelUtil<RoleMenu>(RoleMenu.class);
        return util.exportExcel(list, "menu");
    }

    /**
     * 新增角色和菜单关联
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存角色和菜单关联
     */
    @RequiresPermissions("system:menu:add")
    @Log(title = "角色和菜单关联", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RoleMenu roleMenu)
    {
        return toAjax(roleMenuService.insertRoleMenu(roleMenu));
    }

    /**
     * 修改角色和菜单关联
     */
    @GetMapping("/edit/{roleId}")
    public String edit(@PathVariable("roleId") Long roleId, ModelMap mmap)
    {
        RoleMenu roleMenu = roleMenuService.selectRoleMenuById(roleId);
        mmap.put("roleMenu", roleMenu);
        return prefix + "/edit";
    }

    /**
     * 修改保存角色和菜单关联
     */
    @RequiresPermissions("system:menu:edit")
    @Log(title = "角色和菜单关联", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RoleMenu roleMenu)
    {
        return toAjax(roleMenuService.updateRoleMenu(roleMenu));
    }

    /**
     * 删除角色和菜单关联
     */
    @RequiresPermissions("system:menu:remove")
    @Log(title = "角色和菜单关联", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(roleMenuService.deleteRoleMenuByIds(ids));
    }
}
