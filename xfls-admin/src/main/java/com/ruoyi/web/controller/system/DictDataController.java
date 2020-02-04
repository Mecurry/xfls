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
import com.ruoyi.system.domain.DictData;
import com.ruoyi.system.service.IDictDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 字典数据Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/data")
public class DictDataController extends BaseController
{
    private String prefix = "system/data";

    @Autowired
    private IDictDataService dictDataService;

    @RequiresPermissions("system:data:view")
    @GetMapping()
    public String data()
    {
        return prefix + "/data";
    }

    /**
     * 查询字典数据列表
     */
    @RequiresPermissions("system:data:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DictData dictData)
    {
        startPage();
        List<DictData> list = dictDataService.selectDictDataList(dictData);
        return getDataTable(list);
    }

    /**
     * 导出字典数据列表
     */
    @RequiresPermissions("system:data:export")
    @Log(title = "字典数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DictData dictData)
    {
        List<DictData> list = dictDataService.selectDictDataList(dictData);
        ExcelUtil<DictData> util = new ExcelUtil<DictData>(DictData.class);
        return util.exportExcel(list, "data");
    }

    /**
     * 新增字典数据
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典数据
     */
    @RequiresPermissions("system:data:add")
    @Log(title = "字典数据", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DictData dictData)
    {
        return toAjax(dictDataService.insertDictData(dictData));
    }

    /**
     * 修改字典数据
     */
    @GetMapping("/edit/{dictCode}")
    public String edit(@PathVariable("dictCode") Long dictCode, ModelMap mmap)
    {
        DictData dictData = dictDataService.selectDictDataById(dictCode);
        mmap.put("dictData", dictData);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典数据
     */
    @RequiresPermissions("system:data:edit")
    @Log(title = "字典数据", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DictData dictData)
    {
        return toAjax(dictDataService.updateDictData(dictData));
    }

    /**
     * 删除字典数据
     */
    @RequiresPermissions("system:data:remove")
    @Log(title = "字典数据", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictDataService.deleteDictDataByIds(ids));
    }
}
