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
import com.ruoyi.system.domain.Post;
import com.ruoyi.system.service.IPostService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 岗位信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Controller
@RequestMapping("/system/post")
public class PostController extends BaseController
{
    private String prefix = "system/post";

    @Autowired
    private IPostService postService;

    @RequiresPermissions("system:post:view")
    @GetMapping()
    public String post()
    {
        return prefix + "/post";
    }

    /**
     * 查询岗位信息列表
     */
    @RequiresPermissions("system:post:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Post post)
    {
        startPage();
        List<Post> list = postService.selectPostList(post);
        return getDataTable(list);
    }

    /**
     * 导出岗位信息列表
     */
    @RequiresPermissions("system:post:export")
    @Log(title = "岗位信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Post post)
    {
        List<Post> list = postService.selectPostList(post);
        ExcelUtil<Post> util = new ExcelUtil<Post>(Post.class);
        return util.exportExcel(list, "post");
    }

    /**
     * 新增岗位信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存岗位信息
     */
    @RequiresPermissions("system:post:add")
    @Log(title = "岗位信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Post post)
    {
        return toAjax(postService.insertPost(post));
    }

    /**
     * 修改岗位信息
     */
    @GetMapping("/edit/{postId}")
    public String edit(@PathVariable("postId") Long postId, ModelMap mmap)
    {
        Post post = postService.selectPostById(postId);
        mmap.put("post", post);
        return prefix + "/edit";
    }

    /**
     * 修改保存岗位信息
     */
    @RequiresPermissions("system:post:edit")
    @Log(title = "岗位信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Post post)
    {
        return toAjax(postService.updatePost(post));
    }

    /**
     * 删除岗位信息
     */
    @RequiresPermissions("system:post:remove")
    @Log(title = "岗位信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(postService.deletePostByIds(ids));
    }
}
