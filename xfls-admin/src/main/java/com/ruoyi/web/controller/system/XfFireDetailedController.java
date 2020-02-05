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
import com.ruoyi.system.domain.XfFireDetailed;
import com.ruoyi.system.service.IXfFireDetailedService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【火灾事件详细信息】Controller
 * 
 * @author yanye
 * @date 2020-02-05
 */
@Controller
@RequestMapping("/system/detailed")
public class XfFireDetailedController extends BaseController
{
    private String prefix = "system/detailed";

    @Autowired
    private IXfFireDetailedService xfFireDetailedService;

    @RequiresPermissions("system:detailed:view")
    @GetMapping()
    public String detailed()
    {
        return prefix + "/detailed";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:detailed:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(XfFireDetailed xfFireDetailed)
    {
        startPage();
        List<XfFireDetailed> list = xfFireDetailedService.selectXfFireDetailedList(xfFireDetailed);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:detailed:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(XfFireDetailed xfFireDetailed)
    {
        List<XfFireDetailed> list = xfFireDetailedService.selectXfFireDetailedList(xfFireDetailed);
        ExcelUtil<XfFireDetailed> util = new ExcelUtil<XfFireDetailed>(XfFireDetailed.class);
        return util.exportExcel(list, "detailed");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:detailed:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(XfFireDetailed xfFireDetailed)
    {
        return toAjax(xfFireDetailedService.insertXfFireDetailed(xfFireDetailed));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        XfFireDetailed xfFireDetailed = xfFireDetailedService.selectXfFireDetailedById(id);
        mmap.put("xfFireDetailed", xfFireDetailed);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:detailed:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(XfFireDetailed xfFireDetailed)
    {
        return toAjax(xfFireDetailedService.updateXfFireDetailed(xfFireDetailed));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:detailed:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(xfFireDetailedService.deleteXfFireDetailedByIds(ids));
    }
}
