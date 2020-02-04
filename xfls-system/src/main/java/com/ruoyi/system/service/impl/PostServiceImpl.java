package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PostMapper;
import com.ruoyi.system.domain.Post;
import com.ruoyi.system.service.IPostService;
import com.ruoyi.common.core.text.Convert;

/**
 * 岗位信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class PostServiceImpl implements IPostService 
{
    @Autowired
    private PostMapper postMapper;

    /**
     * 查询岗位信息
     * 
     * @param postId 岗位信息ID
     * @return 岗位信息
     */
    @Override
    public Post selectPostById(Long postId)
    {
        return postMapper.selectPostById(postId);
    }

    /**
     * 查询岗位信息列表
     * 
     * @param post 岗位信息
     * @return 岗位信息
     */
    @Override
    public List<Post> selectPostList(Post post)
    {
        return postMapper.selectPostList(post);
    }

    /**
     * 新增岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    @Override
    public int insertPost(Post post)
    {
        post.setCreateTime(DateUtils.getNowDate());
        return postMapper.insertPost(post);
    }

    /**
     * 修改岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    @Override
    public int updatePost(Post post)
    {
        post.setUpdateTime(DateUtils.getNowDate());
        return postMapper.updatePost(post);
    }

    /**
     * 删除岗位信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePostByIds(String ids)
    {
        return postMapper.deletePostByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除岗位信息信息
     * 
     * @param postId 岗位信息ID
     * @return 结果
     */
    @Override
    public int deletePostById(Long postId)
    {
        return postMapper.deletePostById(postId);
    }
}
