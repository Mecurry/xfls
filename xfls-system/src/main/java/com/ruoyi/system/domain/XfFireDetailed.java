package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 xf_fire_detailed
 * 
 * @author yanye
 * @date 2020-02-05
 */
public class XfFireDetailed extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 火灾序号 */
    private String id;

    /** 消防队名称 */
    @Excel(name = "消防队名称")
    private String fireName;

    /** 出动情况 */
    @Excel(name = "出动情况")
    private String dispatch;

    /** 单位名称 */
    @Excel(name = "单位名称")
    private String companyName;

    /** 户主名 */
    @Excel(name = "户主名")
    private String userName;

    /** 区域 */
    @Excel(name = "区域")
    private String region;

    /** 分级管理 */
    @Excel(name = "分级管理")
    private String classification;

    /** 行业类别 */
    @Excel(name = "行业类别")
    private String industry;

    /** 经济类型 */
    @Excel(name = "经济类型")
    private String economics;

    /** 是否属世界遗产 */
    @Excel(name = "是否属世界遗产")
    private String heritage;

    /** 是否正在调查 */
    @Excel(name = "是否正在调查")
    private String investigation;

    /** 负责调查支队(大队) */
    @Excel(name = "负责调查支队(大队)")
    private String brigade;

    /** 建筑使用性质 */
    @Excel(name = "建筑使用性质")
    private String natureUsage;

    /** 建筑类别 */
    @Excel(name = "建筑类别")
    private String category;

    /** 建筑耐火等级 */
    @Excel(name = "建筑耐火等级")
    private String refractory;

    /** 建筑结构 */
    @Excel(name = "建筑结构")
    private String structure;

    /** 火灾从失火建筑蔓延到临近建筑 */
    @Excel(name = "火灾从失火建筑蔓延到临近建筑")
    private String spread;

    /** 发生轰燃 */
    @Excel(name = "发生轰燃")
    private String flashover;

    /** 失火建筑门窗在火灾过程中开启 */
    @Excel(name = "失火建筑门窗在火灾过程中开启")
    private String process;

    /** 报警系统安装 */
    @Excel(name = "报警系统安装")
    private String alarmInstall;

    /** 报警系统启动 */
    @Excel(name = "报警系统启动")
    private String alarmUp;

    /** 灭火系统安装 */
    @Excel(name = "灭火系统安装")
    private String fightingInstall;

    /** 灭火系统启动 */
    @Excel(name = "灭火系统启动")
    private String fightingUp;

    /** 防排烟系统安装 */
    @Excel(name = "防排烟系统安装")
    private String smokeInstall;

    /** 防排烟系统启动 */
    @Excel(name = "防排烟系统启动")
    private String smokeUp;

    /** 消火栓系统安装 */
    @Excel(name = "消火栓系统安装")
    private String hydrantInstall;

    /** 消火栓系统启动 */
    @Excel(name = "消火栓系统启动")
    private String hydrantUp;

    /** 防火分区 */
    @Excel(name = "防火分区")
    private Double fireCompartment;

    /** 防火间距 */
    @Excel(name = "防火间距")
    private Double fireSpacing;

    /** 疏散通道 */
    @Excel(name = "疏散通道")
    private String escapeRoute;

    /** 应急疏散照明 */
    @Excel(name = "应急疏散照明")
    private String lighting;

    /** 紧急出口 */
    @Excel(name = "紧急出口")
    private String emergencyExit;

    /** 与城市报警系统联网情况 */
    @Excel(name = "与城市报警系统联网情况")
    private String networking;

    /** 起火物 */
    @Excel(name = "起火物")
    private String fireObject;

    /** 保险情况 */
    @Excel(name = "保险情况")
    private String insurance;

    /** 起火经过 */
    @Excel(name = "起火经过")
    private String firePasses;

    /** 现场处置费用 */
    @Excel(name = "现场处置费用")
    private Double disposalCost;

    /** 人身伤亡 */
    @Excel(name = "人身伤亡")
    private Long personalInjury;

    /** 过火面积 */
    @Excel(name = "过火面积")
    private Double burnedArea;

    /** 轻伤人数 */
    @Excel(name = "轻伤人数")
    private Long minorWound;

    /** 是否挂接 */
    @Excel(name = "是否挂接")
    private String hangUp;

    /** 是否有案例 */
    @Excel(name = "是否有案例")
    private String fireCase;

    /** 是否特重大火灾(旧标准) */
    @Excel(name = "是否特重大火灾(旧标准)")
    private String major;

    /** 火灾等级(新标准) */
    @Excel(name = "火灾等级(新标准)")
    private String fireRating;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setFireName(String fireName) 
    {
        this.fireName = fireName;
    }

    public String getFireName() 
    {
        return fireName;
    }
    public void setDispatch(String dispatch) 
    {
        this.dispatch = dispatch;
    }

    public String getDispatch() 
    {
        return dispatch;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public String getRegion() 
    {
        return region;
    }
    public void setClassification(String classification) 
    {
        this.classification = classification;
    }

    public String getClassification() 
    {
        return classification;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setEconomics(String economics) 
    {
        this.economics = economics;
    }

    public String getEconomics() 
    {
        return economics;
    }
    public void setHeritage(String heritage) 
    {
        this.heritage = heritage;
    }

    public String getHeritage() 
    {
        return heritage;
    }
    public void setInvestigation(String investigation) 
    {
        this.investigation = investigation;
    }

    public String getInvestigation() 
    {
        return investigation;
    }
    public void setBrigade(String brigade) 
    {
        this.brigade = brigade;
    }

    public String getBrigade() 
    {
        return brigade;
    }
    public void setNatureUsage(String natureUsage) 
    {
        this.natureUsage = natureUsage;
    }

    public String getNatureUsage() 
    {
        return natureUsage;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setRefractory(String refractory) 
    {
        this.refractory = refractory;
    }

    public String getRefractory() 
    {
        return refractory;
    }
    public void setStructure(String structure) 
    {
        this.structure = structure;
    }

    public String getStructure() 
    {
        return structure;
    }
    public void setSpread(String spread) 
    {
        this.spread = spread;
    }

    public String getSpread() 
    {
        return spread;
    }
    public void setFlashover(String flashover) 
    {
        this.flashover = flashover;
    }

    public String getFlashover() 
    {
        return flashover;
    }
    public void setProcess(String process) 
    {
        this.process = process;
    }

    public String getProcess() 
    {
        return process;
    }
    public void setAlarmInstall(String alarmInstall) 
    {
        this.alarmInstall = alarmInstall;
    }

    public String getAlarmInstall() 
    {
        return alarmInstall;
    }
    public void setAlarmUp(String alarmUp) 
    {
        this.alarmUp = alarmUp;
    }

    public String getAlarmUp() 
    {
        return alarmUp;
    }
    public void setFightingInstall(String fightingInstall) 
    {
        this.fightingInstall = fightingInstall;
    }

    public String getFightingInstall() 
    {
        return fightingInstall;
    }
    public void setFightingUp(String fightingUp) 
    {
        this.fightingUp = fightingUp;
    }

    public String getFightingUp() 
    {
        return fightingUp;
    }
    public void setSmokeInstall(String smokeInstall) 
    {
        this.smokeInstall = smokeInstall;
    }

    public String getSmokeInstall() 
    {
        return smokeInstall;
    }
    public void setSmokeUp(String smokeUp) 
    {
        this.smokeUp = smokeUp;
    }

    public String getSmokeUp() 
    {
        return smokeUp;
    }
    public void setHydrantInstall(String hydrantInstall) 
    {
        this.hydrantInstall = hydrantInstall;
    }

    public String getHydrantInstall() 
    {
        return hydrantInstall;
    }
    public void setHydrantUp(String hydrantUp) 
    {
        this.hydrantUp = hydrantUp;
    }

    public String getHydrantUp() 
    {
        return hydrantUp;
    }
    public void setFireCompartment(Double fireCompartment) 
    {
        this.fireCompartment = fireCompartment;
    }

    public Double getFireCompartment() 
    {
        return fireCompartment;
    }
    public void setFireSpacing(Double fireSpacing) 
    {
        this.fireSpacing = fireSpacing;
    }

    public Double getFireSpacing() 
    {
        return fireSpacing;
    }
    public void setEscapeRoute(String escapeRoute) 
    {
        this.escapeRoute = escapeRoute;
    }

    public String getEscapeRoute() 
    {
        return escapeRoute;
    }
    public void setLighting(String lighting) 
    {
        this.lighting = lighting;
    }

    public String getLighting() 
    {
        return lighting;
    }
    public void setEmergencyExit(String emergencyExit) 
    {
        this.emergencyExit = emergencyExit;
    }

    public String getEmergencyExit() 
    {
        return emergencyExit;
    }
    public void setNetworking(String networking) 
    {
        this.networking = networking;
    }

    public String getNetworking() 
    {
        return networking;
    }
    public void setFireObject(String fireObject) 
    {
        this.fireObject = fireObject;
    }

    public String getFireObject() 
    {
        return fireObject;
    }
    public void setInsurance(String insurance) 
    {
        this.insurance = insurance;
    }

    public String getInsurance() 
    {
        return insurance;
    }
    public void setFirePasses(String firePasses) 
    {
        this.firePasses = firePasses;
    }

    public String getFirePasses() 
    {
        return firePasses;
    }
    public void setDisposalCost(Double disposalCost) 
    {
        this.disposalCost = disposalCost;
    }

    public Double getDisposalCost() 
    {
        return disposalCost;
    }
    public void setPersonalInjury(Long personalInjury) 
    {
        this.personalInjury = personalInjury;
    }

    public Long getPersonalInjury() 
    {
        return personalInjury;
    }
    public void setBurnedArea(Double burnedArea) 
    {
        this.burnedArea = burnedArea;
    }

    public Double getBurnedArea() 
    {
        return burnedArea;
    }
    public void setMinorWound(Long minorWound) 
    {
        this.minorWound = minorWound;
    }

    public Long getMinorWound() 
    {
        return minorWound;
    }
    public void setHangUp(String hangUp) 
    {
        this.hangUp = hangUp;
    }

    public String getHangUp() 
    {
        return hangUp;
    }
    public void setFireCase(String fireCase) 
    {
        this.fireCase = fireCase;
    }

    public String getFireCase() 
    {
        return fireCase;
    }
    public void setMajor(String major) 
    {
        this.major = major;
    }

    public String getMajor() 
    {
        return major;
    }
    public void setFireRating(String fireRating) 
    {
        this.fireRating = fireRating;
    }

    public String getFireRating() 
    {
        return fireRating;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("fireName", getFireName())
            .append("dispatch", getDispatch())
            .append("companyName", getCompanyName())
            .append("userName", getUserName())
            .append("region", getRegion())
            .append("classification", getClassification())
            .append("industry", getIndustry())
            .append("economics", getEconomics())
            .append("heritage", getHeritage())
            .append("investigation", getInvestigation())
            .append("brigade", getBrigade())
            .append("natureUsage", getNatureUsage())
            .append("category", getCategory())
            .append("refractory", getRefractory())
            .append("structure", getStructure())
            .append("spread", getSpread())
            .append("flashover", getFlashover())
            .append("process", getProcess())
            .append("alarmInstall", getAlarmInstall())
            .append("alarmUp", getAlarmUp())
            .append("fightingInstall", getFightingInstall())
            .append("fightingUp", getFightingUp())
            .append("smokeInstall", getSmokeInstall())
            .append("smokeUp", getSmokeUp())
            .append("hydrantInstall", getHydrantInstall())
            .append("hydrantUp", getHydrantUp())
            .append("fireCompartment", getFireCompartment())
            .append("fireSpacing", getFireSpacing())
            .append("escapeRoute", getEscapeRoute())
            .append("lighting", getLighting())
            .append("emergencyExit", getEmergencyExit())
            .append("networking", getNetworking())
            .append("fireObject", getFireObject())
            .append("insurance", getInsurance())
            .append("firePasses", getFirePasses())
            .append("disposalCost", getDisposalCost())
            .append("personalInjury", getPersonalInjury())
            .append("burnedArea", getBurnedArea())
            .append("minorWound", getMinorWound())
            .append("hangUp", getHangUp())
            .append("fireCase", getFireCase())
            .append("major", getMajor())
            .append("fireRating", getFireRating())
            .toString();
    }
}
