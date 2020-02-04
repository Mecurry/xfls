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
import com.ruoyi.system.domain.DictType;
import com.ruoyi.system.service.IDictTypeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 字典类型Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/type")
public class DictTypeController extends BaseController
{
    private String prefix = "system/type";

    @Autowired
    private IDictTypeService dictTypeService;

    @RequiresPermissions("system:type:view")
    @GetMapping()
    public String type()
    {
        return prefix + "/type";
    }

    /**
     * 查询字典类型列表
     */
    @RequiresPermissions("system:type:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DictType dictType)
    {
        startPage();
        List<DictType> list = dictTypeService.selectDictTypeList(dictType);
        return getDataTable(list);
    }

    /**
     * 导出字典类型列表
     */
    @RequiresPermissions("system:type:export")
    @Log(title = "字典类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DictType dictType)
    {
        List<DictType> list = dictTypeService.selectDictTypeList(dictType);
        ExcelUtil<DictType> util = new ExcelUtil<DictType>(DictType.class);
        return util.exportExcel(list, "type");
    }

    /**
     * 新增字典类型
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存字典类型
     */
    @RequiresPermissions("system:type:add")
    @Log(title = "字典类型", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DictType dictType)
    {
        return toAjax(dictTypeService.insertDictType(dictType));
    }

    /**
     * 修改字典类型
     */
    @GetMapping("/edit/{dictId}")
    public String edit(@PathVariable("dictId") Long dictId, ModelMap mmap)
    {
        DictType dictType = dictTypeService.selectDictTypeById(dictId);
        mmap.put("dictType", dictType);
        return prefix + "/edit";
    }

    /**
     * 修改保存字典类型
     */
    @RequiresPermissions("system:type:edit")
    @Log(title = "字典类型", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DictType dictType)
    {
        return toAjax(dictTypeService.updateDictType(dictType));
    }

    /**
     * 删除字典类型
     */
    @RequiresPermissions("system:type:remove")
    @Log(title = "字典类型", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(dictTypeService.deleteDictTypeByIds(ids));
    }
}
