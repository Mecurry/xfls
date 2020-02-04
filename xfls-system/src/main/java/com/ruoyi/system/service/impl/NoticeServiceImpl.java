package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NoticeMapper;
import com.ruoyi.system.domain.Notice;
import com.ruoyi.system.service.INoticeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 通知公告Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
@Service
public class NoticeServiceImpl implements INoticeService 
{
    @Autowired
    private NoticeMapper noticeMapper;

    /**
     * 查询通知公告
     * 
     * @param noticeId 通知公告ID
     * @return 通知公告
     */
    @Override
    public Notice selectNoticeById(Integer noticeId)
    {
        return noticeMapper.selectNoticeById(noticeId);
    }

    /**
     * 查询通知公告列表
     * 
     * @param notice 通知公告
     * @return 通知公告
     */
    @Override
    public List<Notice> selectNoticeList(Notice notice)
    {
        return noticeMapper.selectNoticeList(notice);
    }

    /**
     * 新增通知公告
     * 
     * @param notice 通知公告
     * @return 结果
     */
    @Override
    public int insertNotice(Notice notice)
    {
        notice.setCreateTime(DateUtils.getNowDate());
        return noticeMapper.insertNotice(notice);
    }

    /**
     * 修改通知公告
     * 
     * @param notice 通知公告
     * @return 结果
     */
    @Override
    public int updateNotice(Notice notice)
    {
        notice.setUpdateTime(DateUtils.getNowDate());
        return noticeMapper.updateNotice(notice);
    }

    /**
     * 删除通知公告对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteNoticeByIds(String ids)
    {
        return noticeMapper.deleteNoticeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除通知公告信息
     * 
     * @param noticeId 通知公告ID
     * @return 结果
     */
    @Override
    public int deleteNoticeById(Integer noticeId)
    {
        return noticeMapper.deleteNoticeById(noticeId);
    }
}
