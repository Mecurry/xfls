package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserPostMapper;
import com.ruoyi.system.domain.UserPost;
import com.ruoyi.system.service.IUserPostService;
import com.ruoyi.common.core.text.Convert;

/**
 * 用户与岗位关联Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class UserPostServiceImpl implements IUserPostService 
{
    @Autowired
    private UserPostMapper userPostMapper;

    /**
     * 查询用户与岗位关联
     * 
     * @param userId 用户与岗位关联ID
     * @return 用户与岗位关联
     */
    @Override
    public UserPost selectUserPostById(Long userId)
    {
        return userPostMapper.selectUserPostById(userId);
    }

    /**
     * 查询用户与岗位关联列表
     * 
     * @param userPost 用户与岗位关联
     * @return 用户与岗位关联
     */
    @Override
    public List<UserPost> selectUserPostList(UserPost userPost)
    {
        return userPostMapper.selectUserPostList(userPost);
    }

    /**
     * 新增用户与岗位关联
     * 
     * @param userPost 用户与岗位关联
     * @return 结果
     */
    @Override
    public int insertUserPost(UserPost userPost)
    {
        return userPostMapper.insertUserPost(userPost);
    }

    /**
     * 修改用户与岗位关联
     * 
     * @param userPost 用户与岗位关联
     * @return 结果
     */
    @Override
    public int updateUserPost(UserPost userPost)
    {
        return userPostMapper.updateUserPost(userPost);
    }

    /**
     * 删除用户与岗位关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserPostByIds(String ids)
    {
        return userPostMapper.deleteUserPostByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用户与岗位关联信息
     * 
     * @param userId 用户与岗位关联ID
     * @return 结果
     */
    @Override
    public int deleteUserPostById(Long userId)
    {
        return userPostMapper.deleteUserPostById(userId);
    }
}
