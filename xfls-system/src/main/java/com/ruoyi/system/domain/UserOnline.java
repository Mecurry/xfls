package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 在线用户记录对象 sys_user_online
 * 
 * @author ruoyi
 * @date 2020-02-04
 */
public class UserOnline extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户会话id */
    private String sessionid;

    /** 登录账号 */
    @Excel(name = "登录账号")
    private String loginName;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String deptName;

    /** 登录IP地址 */
    @Excel(name = "登录IP地址")
    private String ipaddr;

    /** 登录地点 */
    @Excel(name = "登录地点")
    private String loginLocation;

    /** 浏览器类型 */
    @Excel(name = "浏览器类型")
    private String browser;

    /** 操作系统 */
    @Excel(name = "操作系统")
    private String os;

    /** 在线状态on_line在线off_line离线 */
    @Excel(name = "在线状态on_line在线off_line离线")
    private String status;

    /** session创建时间 */
    @Excel(name = "session创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTimestamp;

    /** session最后访问时间 */
    @Excel(name = "session最后访问时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastAccessTime;

    /** 超时时间，单位为分钟 */
    @Excel(name = "超时时间，单位为分钟")
    private Integer expireTime;

    public void setSessionid(String sessionid) 
    {
        this.sessionid = sessionid;
    }

    public String getSessionid() 
    {
        return sessionid;
    }
    public void setLoginName(String loginName) 
    {
        this.loginName = loginName;
    }

    public String getLoginName() 
    {
        return loginName;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setIpaddr(String ipaddr) 
    {
        this.ipaddr = ipaddr;
    }

    public String getIpaddr() 
    {
        return ipaddr;
    }
    public void setLoginLocation(String loginLocation) 
    {
        this.loginLocation = loginLocation;
    }

    public String getLoginLocation() 
    {
        return loginLocation;
    }
    public void setBrowser(String browser) 
    {
        this.browser = browser;
    }

    public String getBrowser() 
    {
        return browser;
    }
    public void setOs(String os) 
    {
        this.os = os;
    }

    public String getOs() 
    {
        return os;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setStartTimestamp(Date startTimestamp) 
    {
        this.startTimestamp = startTimestamp;
    }

    public Date getStartTimestamp() 
    {
        return startTimestamp;
    }
    public void setLastAccessTime(Date lastAccessTime) 
    {
        this.lastAccessTime = lastAccessTime;
    }

    public Date getLastAccessTime() 
    {
        return lastAccessTime;
    }
    public void setExpireTime(Integer expireTime) 
    {
        this.expireTime = expireTime;
    }

    public Integer getExpireTime() 
    {
        return expireTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sessionid", getSessionid())
            .append("loginName", getLoginName())
            .append("deptName", getDeptName())
            .append("ipaddr", getIpaddr())
            .append("loginLocation", getLoginLocation())
            .append("browser", getBrowser())
            .append("os", getOs())
            .append("status", getStatus())
            .append("startTimestamp", getStartTimestamp())
            .append("lastAccessTime", getLastAccessTime())
            .append("expireTime", getExpireTime())
            .toString();
    }
}
