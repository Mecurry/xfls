package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.config.Global;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.tool.GetLatAndLngByBaidu;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysDotMap;
import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.domain.XfFireManager;
import com.ruoyi.system.service.IXfFireManagerService;
import com.ruoyi.system.service.impl.SysDotMapServiceImpl;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 【火灾事件列表】Controller
 * 
 * @author yanye
 * @date 2020-02-05
 */
@Controller
@RequestMapping("/system/map")
public class SysDotMapController extends BaseController
{
    private String prefix = "system/map";

    @Autowired
    private SysDotMapServiceImpl sysDotMapServiceImpl;

    @GetMapping("/dotmap")
    public String index(ModelMap mmap)
    {
        return "system/map/baidu-map-point-choropleth";
    }

    @RequestMapping( "/getcoordinateList")
    @ResponseBody
    public AjaxResult getcoordinateList(){
        List<SysDotMap> list = sysDotMapServiceImpl.selectDotMapList();

        return new AjaxResult(AjaxResult.Type.SUCCESS,"查询数据成功",list);
    }



}
