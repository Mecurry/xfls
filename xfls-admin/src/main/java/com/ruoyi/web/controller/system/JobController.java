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
import com.ruoyi.system.domain.Job;
import com.ruoyi.system.service.IJobService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 定时任务调度Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/job")
public class JobController extends BaseController
{
    private String prefix = "system/job";

    @Autowired
    private IJobService jobService;

    @RequiresPermissions("system:job:view")
    @GetMapping()
    public String job()
    {
        return prefix + "/job";
    }

    /**
     * 查询定时任务调度列表
     */
    @RequiresPermissions("system:job:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Job job)
    {
        startPage();
        List<Job> list = jobService.selectJobList(job);
        return getDataTable(list);
    }

    /**
     * 导出定时任务调度列表
     */
    @RequiresPermissions("system:job:export")
    @Log(title = "定时任务调度", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Job job)
    {
        List<Job> list = jobService.selectJobList(job);
        ExcelUtil<Job> util = new ExcelUtil<Job>(Job.class);
        return util.exportExcel(list, "job");
    }

    /**
     * 新增定时任务调度
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存定时任务调度
     */
    @RequiresPermissions("system:job:add")
    @Log(title = "定时任务调度", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Job job)
    {
        return toAjax(jobService.insertJob(job));
    }

    /**
     * 修改定时任务调度
     */
    @GetMapping("/edit/{jobId}")
    public String edit(@PathVariable("jobId") Long jobId, ModelMap mmap)
    {
        Job job = jobService.selectJobById(jobId);
        mmap.put("job", job);
        return prefix + "/edit";
    }

    /**
     * 修改保存定时任务调度
     */
    @RequiresPermissions("system:job:edit")
    @Log(title = "定时任务调度", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Job job)
    {
        return toAjax(jobService.updateJob(job));
    }

    /**
     * 删除定时任务调度
     */
    @RequiresPermissions("system:job:remove")
    @Log(title = "定时任务调度", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jobService.deleteJobByIds(ids));
    }
}
