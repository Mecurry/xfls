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
import com.ruoyi.system.domain.UserPost;
import com.ruoyi.system.service.IUserPostService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户与岗位关联Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/post")
public class UserPostController extends BaseController
{
    private String prefix = "system/post";

    @Autowired
    private IUserPostService userPostService;

    @RequiresPermissions("system:post:view")
    @GetMapping()
    public String post()
    {
        return prefix + "/post";
    }

    /**
     * 查询用户与岗位关联列表
     */
    @RequiresPermissions("system:post:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(UserPost userPost)
    {
        startPage();
        List<UserPost> list = userPostService.selectUserPostList(userPost);
        return getDataTable(list);
    }

    /**
     * 导出用户与岗位关联列表
     */
    @RequiresPermissions("system:post:export")
    @Log(title = "用户与岗位关联", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserPost userPost)
    {
        List<UserPost> list = userPostService.selectUserPostList(userPost);
        ExcelUtil<UserPost> util = new ExcelUtil<UserPost>(UserPost.class);
        return util.exportExcel(list, "post");
    }

    /**
     * 新增用户与岗位关联
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用户与岗位关联
     */
    @RequiresPermissions("system:post:add")
    @Log(title = "用户与岗位关联", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(UserPost userPost)
    {
        return toAjax(userPostService.insertUserPost(userPost));
    }

    /**
     * 修改用户与岗位关联
     */
    @GetMapping("/edit/{userId}")
    public String edit(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        UserPost userPost = userPostService.selectUserPostById(userId);
        mmap.put("userPost", userPost);
        return prefix + "/edit";
    }

    /**
     * 修改保存用户与岗位关联
     */
    @RequiresPermissions("system:post:edit")
    @Log(title = "用户与岗位关联", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UserPost userPost)
    {
        return toAjax(userPostService.updateUserPost(userPost));
    }

    /**
     * 删除用户与岗位关联
     */
    @RequiresPermissions("system:post:remove")
    @Log(title = "用户与岗位关联", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(userPostService.deleteUserPostByIds(ids));
    }
}
