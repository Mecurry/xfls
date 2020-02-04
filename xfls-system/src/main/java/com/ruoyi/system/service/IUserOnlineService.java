package com.ruoyi.system.service;

import com.ruoyi.system.domain.UserOnline;
import java.util.List;

/**
 * 在线用户记录Service接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface IUserOnlineService 
{
    /**
     * 查询在线用户记录
     * 
     * @param sessionid 在线用户记录ID
     * @return 在线用户记录
     */
    public UserOnline selectUserOnlineById(String sessionid);

    /**
     * 查询在线用户记录列表
     * 
     * @param userOnline 在线用户记录
     * @return 在线用户记录集合
     */
    public List<UserOnline> selectUserOnlineList(UserOnline userOnline);

    /**
     * 新增在线用户记录
     * 
     * @param userOnline 在线用户记录
     * @return 结果
     */
    public int insertUserOnline(UserOnline userOnline);

    /**
     * 修改在线用户记录
     * 
     * @param userOnline 在线用户记录
     * @return 结果
     */
    public int updateUserOnline(UserOnline userOnline);

    /**
     * 批量删除在线用户记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserOnlineByIds(String ids);

    /**
     * 删除在线用户记录信息
     * 
     * @param sessionid 在线用户记录ID
     * @return 结果
     */
    public int deleteUserOnlineById(String sessionid);
}
