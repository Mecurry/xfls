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
import com.ruoyi.system.domain.Notice;
import com.ruoyi.system.service.INoticeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通知公告Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/notice")
public class NoticeController extends BaseController
{
    private String prefix = "system/notice";

    @Autowired
    private INoticeService noticeService;

    @RequiresPermissions("system:notice:view")
    @GetMapping()
    public String notice()
    {
        return prefix + "/notice";
    }

    /**
     * 查询通知公告列表
     */
    @RequiresPermissions("system:notice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Notice notice)
    {
        startPage();
        List<Notice> list = noticeService.selectNoticeList(notice);
        return getDataTable(list);
    }

    /**
     * 导出通知公告列表
     */
    @RequiresPermissions("system:notice:export")
    @Log(title = "通知公告", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Notice notice)
    {
        List<Notice> list = noticeService.selectNoticeList(notice);
        ExcelUtil<Notice> util = new ExcelUtil<Notice>(Notice.class);
        return util.exportExcel(list, "notice");
    }

    /**
     * 新增通知公告
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存通知公告
     */
    @RequiresPermissions("system:notice:add")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Notice notice)
    {
        return toAjax(noticeService.insertNotice(notice));
    }

    /**
     * 修改通知公告
     */
    @GetMapping("/edit/{noticeId}")
    public String edit(@PathVariable("noticeId") Integer noticeId, ModelMap mmap)
    {
        Notice notice = noticeService.selectNoticeById(noticeId);
        mmap.put("notice", notice);
        return prefix + "/edit";
    }

    /**
     * 修改保存通知公告
     */
    @RequiresPermissions("system:notice:edit")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Notice notice)
    {
        return toAjax(noticeService.updateNotice(notice));
    }

    /**
     * 删除通知公告
     */
    @RequiresPermissions("system:notice:remove")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(noticeService.deleteNoticeByIds(ids));
    }
}