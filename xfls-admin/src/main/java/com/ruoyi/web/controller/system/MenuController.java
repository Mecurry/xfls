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
import com.ruoyi.system.domain.Menu;
import com.ruoyi.system.service.IMenuService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 菜单权限Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/menu")
public class MenuController extends BaseController
{
    private String prefix = "system/menu";

    @Autowired
    private IMenuService menuService;

    @RequiresPermissions("system:menu:view")
    @GetMapping()
    public String menu()
    {
        return prefix + "/menu";
    }

    /**
     * 查询菜单权限列表
     */
    @RequiresPermissions("system:menu:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Menu menu)
    {
        startPage();
        List<Menu> list = menuService.selectMenuList(menu);
        return getDataTable(list);
    }

    /**
     * 导出菜单权限列表
     */
    @RequiresPermissions("system:menu:export")
    @Log(title = "菜单权限", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Menu menu)
    {
        List<Menu> list = menuService.selectMenuList(menu);
        ExcelUtil<Menu> util = new ExcelUtil<Menu>(Menu.class);
        return util.exportExcel(list, "menu");
    }

    /**
     * 新增菜单权限
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存菜单权限
     */
    @RequiresPermissions("system:menu:add")
    @Log(title = "菜单权限", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Menu menu)
    {
        return toAjax(menuService.insertMenu(menu));
    }

    /**
     * 修改菜单权限
     */
    @GetMapping("/edit/{menuId}")
    public String edit(@PathVariable("menuId") Long menuId, ModelMap mmap)
    {
        Menu menu = menuService.selectMenuById(menuId);
        mmap.put("menu", menu);
        return prefix + "/edit";
    }

    /**
     * 修改保存菜单权限
     */
    @RequiresPermissions("system:menu:edit")
    @Log(title = "菜单权限", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Menu menu)
    {
        return toAjax(menuService.updateMenu(menu));
    }

    /**
     * 删除菜单权限
     */
    @RequiresPermissions("system:menu:remove")
    @Log(title = "菜单权限", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(menuService.deleteMenuByIds(ids));
    }
}
