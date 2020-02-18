package com.ruoyi.web.controller.system;

import java.io.IOException;
import java.util.*;

import com.ruoyi.common.tool.GetLatAndLngByBaidu;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.XfFireManager;
import com.ruoyi.system.service.IXfFireManagerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【火灾事件列表】Controller
 * 
 * @author yanye
 * @date 2020-02-05
 */
@Controller
@RequestMapping("/system/manager")
public class XfFireManagerController extends BaseController
{
    private String prefix = "system/manager";

    @Autowired
    private IXfFireManagerService xfFireManagerService;

    @RequiresPermissions("system:manager:view")
    @GetMapping()
    public String manager()
    {
        return prefix + "/manager";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:manager:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(XfFireManager xfFireManager)
    {
        startPage();
        List<XfFireManager> list = xfFireManagerService.selectXfFireManagerList(xfFireManager);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:manager:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(XfFireManager xfFireManager)
    {
        List<XfFireManager> list = xfFireManagerService.selectXfFireManagerList(xfFireManager);
        ExcelUtil<XfFireManager> util = new ExcelUtil<XfFireManager>(XfFireManager.class);
        return util.exportExcel(list, "manager");
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
    @RequiresPermissions("system:manager:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(XfFireManager xfFireManager)
    {
        return toAjax(xfFireManagerService.insertXfFireManager(xfFireManager));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        XfFireManager xfFireManager = xfFireManagerService.selectXfFireManagerById(id);
        mmap.put("xfFireManager", xfFireManager);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:manager:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(XfFireManager xfFireManager)
    {
        return toAjax(xfFireManagerService.updateXfFireManager(xfFireManager));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:manager:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(xfFireManagerService.deleteXfFireManagerByIds(ids));
    }


    /**
     * 添加列表坐标
     */
    @GetMapping("/addCoordinate")
    @ResponseBody
    public void addCoordinate(){
        List<XfFireManager> list = xfFireManagerService.selectXfFireManagerList(null);
        for(int i=0;i<list.size();i++){
            GetLatAndLngByBaidu getLatAndLngByBaidu = new GetLatAndLngByBaidu();
            String addr = "昆明市"+list.get(i).getPlace();
            Object[] o = new Object[0];
            try {
                o = getLatAndLngByBaidu.getCoordinate(addr);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.println("经度:"+o[0]);// 经度
//            System.out.println("纬度:"+o[1]);// 纬度

            double x = Double.parseDouble(o[0].toString());
            double y = Double.parseDouble(o[1].toString());

            list.get(i).setCoordinateX(x);
            list.get(i).setCoordinateY(y);
            xfFireManagerService.updateXfFireManager(list.get(i));
        }
    }

    /**
     * 查询所有坐标
     * 损失经济查询
     */
    @PostMapping( "/getFireList")
    @ResponseBody
    public AjaxResult getFireList(){
        List<XfFireManager> list = xfFireManagerService.selectXfFireManagerList(null);

        Map<String,Object> map = new HashMap<>();
        double propertyLoss = 0.0;
        double propertyLoss2 = 20000.0;
        Map<String,Object> m1 = new HashMap<>();
        m1.put("propertyLoss",propertyLoss);
        m1.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list1 = xfFireManagerService.getStatisticsList(m1);
        map.put("grade1",list1.size());

        Map<String,Object> m2 = new HashMap<>();
        propertyLoss = 20000.0;
        propertyLoss2 = 50000.0;
        m2.put("propertyLoss",propertyLoss);
        m2.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list2 = xfFireManagerService.getStatisticsList(m2);
        map.put("grade2",list2.size());

        Map<String,Object> m3 = new HashMap<>();
        propertyLoss = 50000.0;
        propertyLoss2 = 100000.0;
        m3.put("propertyLoss",propertyLoss);
        m3.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list3 = xfFireManagerService.getStatisticsList(m3);
        map.put("grade3",list3.size());

        Map<String,Object> m4 = new HashMap<>();
        propertyLoss = 100000.0;
        propertyLoss2 = 999999999.0;
        m4.put("propertyLoss",propertyLoss);
        m4.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list4 = xfFireManagerService.getStatisticsList(m4);
        map.put("grade4",list4.size());
        map.put("list",list);

        return new AjaxResult(AjaxResult.Type.SUCCESS,"查询数据成功",map);
    }


    /**
     * 按损失经济查询
     */
    @PostMapping( "/getStatisticsList")
    @ResponseBody
    public AjaxResult getStatisticsList(){
        Map<String,Object> map = new HashMap<>();
        double propertyLoss = 0.0;
        double propertyLoss2 = 20000.0;
        Map<String,Object> m1 = new HashMap<>();
        m1.put("propertyLoss",propertyLoss);
        m1.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list1 = xfFireManagerService.getStatisticsList(m1);
        map.put("grade1",list1.size());

        Map<String,Object> m2 = new HashMap<>();
        propertyLoss = 20000.0;
        propertyLoss2 = 50000.0;
        m2.put("propertyLoss",propertyLoss);
        m2.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list2 = xfFireManagerService.getStatisticsList(m2);
        map.put("grade2",list2.size());

        Map<String,Object> m3 = new HashMap<>();
        propertyLoss = 50000.0;
        propertyLoss2 = 100000.0;
        m3.put("propertyLoss",propertyLoss);
        m3.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list3 = xfFireManagerService.getStatisticsList(m3);
        map.put("grade3",list3.size());

        Map<String,Object> m4 = new HashMap<>();
        propertyLoss = 100000.0;
        propertyLoss2 = 999999999.0;
        m4.put("propertyLoss",propertyLoss);
        m4.put("propertyLoss2",propertyLoss2);
        List<XfFireManager> list4 = xfFireManagerService.getStatisticsList(m4);
        map.put("grade4",list4.size());

        return new AjaxResult(AjaxResult.Type.SUCCESS,"查询数据成功",map);
    }

    /**
     * 跳转到每年火灾图表页面
     * @param model
     * @return
     */
    @RequiresPermissions("system:manager:list")
    @GetMapping("/yearlyFire")
    public String linkYearlyFireEchartPage(Model model) {
        List<XfFireManager> xfmList=xfFireManagerService.selectXfFireManagerListOrderByDATE(new XfFireManager());

        if(xfmList.size()>0 && xfmList!=null){
            model.addAttribute("fireList",xfmList);
            return  "/yearlyFire";
        }else{
            throw new NullPointerException("未取到图表数据");
        }
    }
}
