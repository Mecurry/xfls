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
import com.ruoyi.system.domain.Dept;
import com.ruoyi.system.service.IDeptService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 部门Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/dept")
public class DeptController extends BaseController
{
    private String prefix = "system/dept";

    @Autowired
    private IDeptService deptService;

    @RequiresPermissions("system:dept:view")
    @GetMapping()
    public String dept()
    {
        return prefix + "/dept";
    }

    /**
     * 查询部门列表
     */
    @RequiresPermissions("system:dept:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Dept dept)
    {
        startPage();
        List<Dept> list = deptService.selectDeptList(dept);
        return getDataTable(list);
    }

    /**
     * 导出部门列表
     */
    @RequiresPermissions("system:dept:export")
    @Log(title = "部门", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Dept dept)
    {
        List<Dept> list = deptService.selectDeptList(dept);
        ExcelUtil<Dept> util = new ExcelUtil<Dept>(Dept.class);
        return util.exportExcel(list, "dept");
    }

    /**
     * 新增部门
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存部门
     */
    @RequiresPermissions("system:dept:add")
    @Log(title = "部门", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Dept dept)
    {
        return toAjax(deptService.insertDept(dept));
    }

    /**
     * 修改部门
     */
    @GetMapping("/edit/{deptId}")
    public String edit(@PathVariable("deptId") Long deptId, ModelMap mmap)
    {
        Dept dept = deptService.selectDeptById(deptId);
        mmap.put("dept", dept);
        return prefix + "/edit";
    }

    /**
     * 修改保存部门
     */
    @RequiresPermissions("system:dept:edit")
    @Log(title = "部门", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Dept dept)
    {
        return toAjax(deptService.updateDept(dept));
    }

    /**
     * 删除部门
     */
    @RequiresPermissions("system:dept:remove")
    @Log(title = "部门", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(deptService.deleteDeptByIds(ids));
    }
}
