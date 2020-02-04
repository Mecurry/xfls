package com.ruoyi.system.service;

import com.ruoyi.system.domain.Post;
import java.util.List;

/**
 * 岗位信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IPostService 
{
    /**
     * 查询岗位信息
     * 
     * @param postId 岗位信息ID
     * @return 岗位信息
     */
    public Post selectPostById(Long postId);

    /**
     * 查询岗位信息列表
     * 
     * @param post 岗位信息
     * @return 岗位信息集合
     */
    public List<Post> selectPostList(Post post);

    /**
     * 新增岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    public int insertPost(Post post);

    /**
     * 修改岗位信息
     * 
     * @param post 岗位信息
     * @return 结果
     */
    public int updatePost(Post post);

    /**
     * 批量删除岗位信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePostByIds(String ids);

    /**
     * 删除岗位信息信息
     * 
     * @param postId 岗位信息ID
     * @return 结果
     */
    public int deletePostById(Long postId);
}
