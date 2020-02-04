package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Notice;
import java.util.List;

/**
 * 通知公告Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public interface NoticeMapper 
{
    /**
     * 查询通知公告
     * 
     * @param noticeId 通知公告ID
     * @return 通知公告
     */
    public Notice selectNoticeById(Integer noticeId);

    /**
     * 查询通知公告列表
     * 
     * @param notice 通知公告
     * @return 通知公告集合
     */
    public List<Notice> selectNoticeList(Notice notice);

    /**
     * 新增通知公告
     * 
     * @param notice 通知公告
     * @return 结果
     */
    public int insertNotice(Notice notice);

    /**
     * 修改通知公告
     * 
     * @param notice 通知公告
     * @return 结果
     */
    public int updateNotice(Notice notice);

    /**
     * 删除通知公告
     * 
     * @param noticeId 通知公告ID
     * @return 结果
     */
    public int deleteNoticeById(Integer noticeId);

    /**
     * 批量删除通知公告
     * 
     * @param noticeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteNoticeByIds(String[] noticeIds);
}
