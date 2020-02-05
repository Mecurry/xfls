package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 【火灾列表实体】对象 xf_fire_manager
 * 
 * @author yanye
 * @date 2020-02-05
 */
public class XfFireManager extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 火灾序号 */
    private String id;

    /** 行政区域编码 */
    @Excel(name = "行政区域编码")
    private String region;

    /** 起火地点 */
    @Excel(name = "起火地点")
    private String place;

    /** 起火时间 */
    @Excel(name = "起火时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fireDate;

    /** 起火场所 */
    @Excel(name = "起火场所")
    private String firePlace;

    /** 火灾原因分类 */
    @Excel(name = "火灾原因分类")
    private String reasonCategory;

    /** 单位代码 */
    @Excel(name = "单位代码")
    private String company;

    /** 受灾户数 */
    @Excel(name = "受灾户数")
    private Long households;

    /** 直接财产损失 */
    @Excel(name = "直接财产损失")
    private Long propertyLoss;

    /** 受伤人数 */
    @Excel(name = "受伤人数")
    private Long injured;

    /** 死亡人数 */
    @Excel(name = "死亡人数")
    private Long death;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String auditStatus;

    /** 正在调查 */
    @Excel(name = "正在调查")
    private String investigation;

    /** X坐标 */
    @Excel(name = "X坐标")
    private Double coordinateX;

    /** Y坐标 */
    @Excel(name = "Y坐标")
    private Double coordinateY;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public String getRegion() 
    {
        return region;
    }
    public void setPlace(String place) 
    {
        this.place = place;
    }

    public String getPlace() 
    {
        return place;
    }
    public void setFireDate(Date fireDate) 
    {
        this.fireDate = fireDate;
    }

    public Date getFireDate() 
    {
        return fireDate;
    }
    public void setFirePlace(String firePlace) 
    {
        this.firePlace = firePlace;
    }

    public String getFirePlace() 
    {
        return firePlace;
    }
    public void setReasonCategory(String reasonCategory) 
    {
        this.reasonCategory = reasonCategory;
    }

    public String getReasonCategory() 
    {
        return reasonCategory;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setHouseholds(Long households) 
    {
        this.households = households;
    }

    public Long getHouseholds() 
    {
        return households;
    }
    public void setPropertyLoss(Long propertyLoss) 
    {
        this.propertyLoss = propertyLoss;
    }

    public Long getPropertyLoss() 
    {
        return propertyLoss;
    }
    public void setInjured(Long injured) 
    {
        this.injured = injured;
    }

    public Long getInjured() 
    {
        return injured;
    }
    public void setDeath(Long death) 
    {
        this.death = death;
    }

    public Long getDeath() 
    {
        return death;
    }
    public void setAuditStatus(String auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatus() 
    {
        return auditStatus;
    }
    public void setInvestigation(String investigation) 
    {
        this.investigation = investigation;
    }

    public String getInvestigation() 
    {
        return investigation;
    }
    public void setCoordinateX(Double coordinateX)
    {
        this.coordinateX = coordinateX;
    }

    public Double getCoordinateX()
    {
        return coordinateX;
    }
    public void setCoordinateY(Double coordinateY) 
    {
        this.coordinateY = coordinateY;
    }

    public Double getCoordinateY() 
    {
        return coordinateY;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("region", getRegion())
            .append("place", getPlace())
            .append("fireDate", getFireDate())
            .append("firePlace", getFirePlace())
            .append("reasonCategory", getReasonCategory())
            .append("company", getCompany())
            .append("households", getHouseholds())
            .append("propertyLoss", getPropertyLoss())
            .append("injured", getInjured())
            .append("death", getDeath())
            .append("auditStatus", getAuditStatus())
            .append("investigation", getInvestigation())
            .append("coordinateX", getCoordinateX())
            .append("coordinateY", getCoordinateY())
            .toString();
    }
}
