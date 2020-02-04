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
import com.ruoyi.system.domain.UserOnline;
import com.ruoyi.system.service.IUserOnlineService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 在线用户记录Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/online")
public class UserOnlineController extends BaseController
{
    private String prefix = "system/online";

    @Autowired
    private IUserOnlineService userOnlineService;

    @RequiresPermissions("system:online:view")
    @GetMapping()
    public String online()
    {
        return prefix + "/online";
    }

    /**
     * 查询在线用户记录列表
     */
    @RequiresPermissions("system:online:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(UserOnline userOnline)
    {
        startPage();
        List<UserOnline> list = userOnlineService.selectUserOnlineList(userOnline);
        return getDataTable(list);
    }

    /**
     * 导出在线用户记录列表
     */
    @RequiresPermissions("system:online:export")
    @Log(title = "在线用户记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserOnline userOnline)
    {
        List<UserOnline> list = userOnlineService.selectUserOnlineList(userOnline);
        ExcelUtil<UserOnline> util = new ExcelUtil<UserOnline>(UserOnline.class);
        return util.exportExcel(list, "online");
    }

    /**
     * 新增在线用户记录
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存在线用户记录
     */
    @RequiresPermissions("system:online:add")
    @Log(title = "在线用户记录", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(UserOnline userOnline)
    {
        return toAjax(userOnlineService.insertUserOnline(userOnline));
    }

    /**
     * 修改在线用户记录
     */
    @GetMapping("/edit/{sessionid}")
    public String edit(@PathVariable("sessionid") String sessionid, ModelMap mmap)
    {
        UserOnline userOnline = userOnlineService.selectUserOnlineById(sessionid);
        mmap.put("userOnline", userOnline);
        return prefix + "/edit";
    }

    /**
     * 修改保存在线用户记录
     */
    @RequiresPermissions("system:online:edit")
    @Log(title = "在线用户记录", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UserOnline userOnline)
    {
        return toAjax(userOnlineService.updateUserOnline(userOnline));
    }

    /**
     * 删除在线用户记录
     */
    @RequiresPermissions("system:online:remove")
    @Log(title = "在线用户记录", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(userOnlineService.deleteUserOnlineByIds(ids));
    }
}
