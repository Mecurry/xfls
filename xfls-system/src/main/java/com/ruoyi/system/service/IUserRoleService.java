package com.ruoyi.system.service;

import com.ruoyi.system.domain.UserRole;
import java.util.List;

/**
 * 用户和角色关联Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IUserRoleService 
{
    /**
     * 查询用户和角色关联
     * 
     * @param userId 用户和角色关联ID
     * @return 用户和角色关联
     */
    public UserRole selectUserRoleById(Long userId);

    /**
     * 查询用户和角色关联列表
     * 
     * @param userRole 用户和角色关联
     * @return 用户和角色关联集合
     */
    public List<UserRole> selectUserRoleList(UserRole userRole);

    /**
     * 新增用户和角色关联
     * 
     * @param userRole 用户和角色关联
     * @return 结果
     */
    public int insertUserRole(UserRole userRole);

    /**
     * 修改用户和角色关联
     * 
     * @param userRole 用户和角色关联
     * @return 结果
     */
    public int updateUserRole(UserRole userRole);

    /**
     * 批量删除用户和角色关联
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserRoleByIds(String ids);

    /**
     * 删除用户和角色关联信息
     * 
     * @param userId 用户和角色关联ID
     * @return 结果
     */
    public int deleteUserRoleById(Long userId);
}
