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
import com.ruoyi.system.domain.UserRole;
import com.ruoyi.system.service.IUserRoleService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户和角色关联Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/role")
public class UserRoleController extends BaseController
{
    private String prefix = "system/role";

    @Autowired
    private IUserRoleService userRoleService;

    @RequiresPermissions("system:role:view")
    @GetMapping()
    public String role()
    {
        return prefix + "/role";
    }

    /**
     * 查询用户和角色关联列表
     */
    @RequiresPermissions("system:role:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(UserRole userRole)
    {
        startPage();
        List<UserRole> list = userRoleService.selectUserRoleList(userRole);
        return getDataTable(list);
    }

    /**
     * 导出用户和角色关联列表
     */
    @RequiresPermissions("system:role:export")
    @Log(title = "用户和角色关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserRole userRole)
    {
        List<UserRole> list = userRoleService.selectUserRoleList(userRole);
        ExcelUtil<UserRole> util = new ExcelUtil<UserRole>(UserRole.class);
        return util.exportExcel(list, "role");
    }

    /**
     * 新增用户和角色关联
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用户和角色关联
     */
    @RequiresPermissions("system:role:add")
    @Log(title = "用户和角色关联", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(UserRole userRole)
    {
        return toAjax(userRoleService.insertUserRole(userRole));
    }

    /**
     * 修改用户和角色关联
     */
    @GetMapping("/edit/{userId}")
    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        UserRole userRole = userRoleService.selectUserRoleById(userId);
        mmap.put("userRole", userRole);
        return prefix + "/edit";
    }

    /**
     * 修改保存用户和角色关联
     */
    @RequiresPermissions("system:role:edit")
    @Log(title = "用户和角色关联", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UserRole userRole)
    {
        return toAjax(userRoleService.updateUserRole(userRole));
    }

    /**
     * 删除用户和角色关联
     */
    @RequiresPermissions("system:role:remove")
    @Log(title = "用户和角色关联", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(userRoleService.deleteUserRoleByIds(ids));
    }
}
