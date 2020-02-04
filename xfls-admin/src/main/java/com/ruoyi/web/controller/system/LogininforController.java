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
import com.ruoyi.system.domain.Logininfor;
import com.ruoyi.system.service.ILogininforService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 系统访问记录Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/logininfor")
public class LogininforController extends BaseController
{
    private String prefix = "system/logininfor";

    @Autowired
    private ILogininforService logininforService;

    @RequiresPermissions("system:logininfor:view")
    @GetMapping()
    public String logininfor()
    {
        return prefix + "/logininfor";
    }

    /**
     * 查询系统访问记录列表
     */
    @RequiresPermissions("system:logininfor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Logininfor logininfor)
    {
        startPage();
        List<Logininfor> list = logininforService.selectLogininforList(logininfor);
        return getDataTable(list);
    }

    /**
     * 导出系统访问记录列表
     */
    @RequiresPermissions("system:logininfor:export")
    @Log(title = "系统访问记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Logininfor logininfor)
    {
        List<Logininfor> list = logininforService.selectLogininforList(logininfor);
        ExcelUtil<Logininfor> util = new ExcelUtil<Logininfor>(Logininfor.class);
        return util.exportExcel(list, "logininfor");
    }

    /**
     * 新增系统访问记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存系统访问记录
     */
    @RequiresPermissions("system:logininfor:add")
    @Log(title = "系统访问记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Logininfor logininfor)
    {
        return toAjax(logininforService.insertLogininfor(logininfor));
    }

    /**
     * 修改系统访问记录
     */
    @GetMapping("/edit/{infoId}")
    public String edit(@PathVariable("infoId") Long infoId, ModelMap mmap)
    {
        Logininfor logininfor = logininforService.selectLogininforById(infoId);
        mmap.put("logininfor", logininfor);
        return prefix + "/edit";
    }

    /**
     * 修改保存系统访问记录
     */
    @RequiresPermissions("system:logininfor:edit")
    @Log(title = "系统访问记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Logininfor logininfor)
    {
        return toAjax(logininforService.updateLogininfor(logininfor));
    }

    /**
     * 删除系统访问记录
     */
    @RequiresPermissions("system:logininfor:remove")
    @Log(title = "系统访问记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(logininforService.deleteLogininforByIds(ids));
    }
}
