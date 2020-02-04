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
import com.ruoyi.system.domain.RoleDept;
import com.ruoyi.system.service.IRoleDeptService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 角色和部门关联Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/dept")
public class RoleDeptController extends BaseController
{
    private String prefix = "system/dept";

    @Autowired
    private IRoleDeptService roleDeptService;

    @RequiresPermissions("system:dept:view")
    @GetMapping()
    public String dept()
    {
        return prefix + "/dept";
    }

    /**
     * 查询角色和部门关联列表
     */
    @RequiresPermissions("system:dept:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RoleDept roleDept)
    {
        startPage();
        List<RoleDept> list = roleDeptService.selectRoleDeptList(roleDept);
        return getDataTable(list);
    }

    /**
     * 导出角色和部门关联列表
     */
    @RequiresPermissions("system:dept:export")
    @Log(title = "角色和部门关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RoleDept roleDept)
    {
        List<RoleDept> list = roleDeptService.selectRoleDeptList(roleDept);
        ExcelUtil<RoleDept> util = new ExcelUtil<RoleDept>(RoleDept.class);
        return util.exportExcel(list, "dept");
    }

    /**
     * 新增角色和部门关联
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存角色和部门关联
     */
    @RequiresPermissions("system:dept:add")
    @Log(title = "角色和部门关联", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RoleDept roleDept)
    {
        return toAjax(roleDeptService.insertRoleDept(roleDept));
    }

    /**
     * 修改角色和部门关联
     */
    @GetMapping("/edit/{roleId}")
    public String edit(@PathVariable("roleId") Long roleId, ModelMap mmap)
    {
        RoleDept roleDept = roleDeptService.selectRoleDeptById(roleId);
        mmap.put("roleDept", roleDept);
        return prefix + "/edit";
    }

    /**
     * 修改保存角色和部门关联
     */
    @RequiresPermissions("system:dept:edit")
    @Log(title = "角色和部门关联", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RoleDept roleDept)
    {
        return toAjax(roleDeptService.updateRoleDept(roleDept));
    }

    /**
     * 删除角色和部门关联
     */
    @RequiresPermissions("system:dept:remove")
    @Log(title = "角色和部门关联", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(roleDeptService.deleteRoleDeptByIds(ids));
    }
}
