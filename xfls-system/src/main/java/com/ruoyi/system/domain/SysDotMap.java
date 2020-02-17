package com.ruoyi.system.domain;


import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author hjl
 * @create 2020/2/14 - 10:05
 */
public class SysDotMap extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /** X坐标 */
    private Double coordinateX;

    /** Y坐标 */
    private Double coordinateY;

    public Double getCoordinateX() {
        return coordinateX;
    }

    public Double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(Double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(Double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("coordinateX", getCoordinateX())
                .append("coordinateY", getCoordinateY())
                .toString();
    }
}
