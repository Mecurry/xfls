package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.RoleDept;
import java.util.List;

/**
 * 角色和部门关联Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface RoleDeptMapper 
{
    /**
     * 查询角色和部门关联
     * 
     * @param roleId 角色和部门关联ID
     * @return 角色和部门关联
     */
    public RoleDept selectRoleDeptById(Long roleId);

    /**
     * 查询角色和部门关联列表
     * 
     * @param roleDept 角色和部门关联
     * @return 角色和部门关联集合
     */
    public List<RoleDept> selectRoleDeptList(RoleDept roleDept);

    /**
     * 新增角色和部门关联
     * 
     * @param roleDept 角色和部门关联
     * @return 结果
     */
    public int insertRoleDept(RoleDept roleDept);

    /**
     * 修改角色和部门关联
     * 
     * @param roleDept 角色和部门关联
     * @return 结果
     */
    public int updateRoleDept(RoleDept roleDept);

    /**
     * 删除角色和部门关联
     * 
     * @param roleId 角色和部门关联ID
     * @return 结果
     */
    public int deleteRoleDeptById(Long roleId);

    /**
     * 批量删除角色和部门关联
     * 
     * @param roleIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleDeptByIds(String[] roleIds);
}
