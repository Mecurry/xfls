package com.ruoyi.system.service;

import com.ruoyi.system.domain.UserPost;
import java.util.List;

/**
 * 用户与岗位关联Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IUserPostService 
{
    /**
     * 查询用户与岗位关联
     * 
     * @param userId 用户与岗位关联ID
     * @return 用户与岗位关联
     */
    public UserPost selectUserPostById(Long userId);

    /**
     * 查询用户与岗位关联列表
     * 
     * @param userPost 用户与岗位关联
     * @return 用户与岗位关联集合
     */
    public List<UserPost> selectUserPostList(UserPost userPost);

    /**
     * 新增用户与岗位关联
     * 
     * @param userPost 用户与岗位关联
     * @return 结果
     */
    public int insertUserPost(UserPost userPost);

    /**
     * 修改用户与岗位关联
     * 
     * @param userPost 用户与岗位关联
     * @return 结果
     */
    public int updateUserPost(UserPost userPost);

    /**
     * 批量删除用户与岗位关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserPostByIds(String ids);

    /**
     * 删除用户与岗位关联信息
     * 
     * @param userId 用户与岗位关联ID
     * @return 结果
     */
    public int deleteUserPostById(Long userId);
}
