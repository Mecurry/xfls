package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UserOnlineMapper;
import com.ruoyi.system.domain.UserOnline;
import com.ruoyi.system.service.IUserOnlineService;
import com.ruoyi.common.core.text.Convert;

/**
 * 在线用户记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class UserOnlineServiceImpl implements IUserOnlineService 
{
    @Autowired
    private UserOnlineMapper userOnlineMapper;

    /**
     * 查询在线用户记录
     * 
     * @param sessionid 在线用户记录ID
     * @return 在线用户记录
     */
    @Override
    public UserOnline selectUserOnlineById(String sessionid)
    {
        return userOnlineMapper.selectUserOnlineById(sessionid);
    }

    /**
     * 查询在线用户记录列表
     * 
     * @param userOnline 在线用户记录
     * @return 在线用户记录
     */
    @Override
    public List<UserOnline> selectUserOnlineList(UserOnline userOnline)
    {
        return userOnlineMapper.selectUserOnlineList(userOnline);
    }

    /**
     * 新增在线用户记录
     * 
     * @param userOnline 在线用户记录
     * @return 结果
     */
    @Override
    public int insertUserOnline(UserOnline userOnline)
    {
        return userOnlineMapper.insertUserOnline(userOnline);
    }

    /**
     * 修改在线用户记录
     * 
     * @param userOnline 在线用户记录
     * @return 结果
     */
    @Override
    public int updateUserOnline(UserOnline userOnline)
    {
        return userOnlineMapper.updateUserOnline(userOnline);
    }

    /**
     * 删除在线用户记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserOnlineByIds(String ids)
    {
        return userOnlineMapper.deleteUserOnlineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除在线用户记录信息
     * 
     * @param sessionid 在线用户记录ID
     * @return 结果
     */
    @Override
    public int deleteUserOnlineById(String sessionid)
    {
        return userOnlineMapper.deleteUserOnlineById(sessionid);
    }
}
