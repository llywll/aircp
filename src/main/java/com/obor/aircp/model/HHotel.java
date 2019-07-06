package com.obor.aircp.model;

import java.io.Serializable;

/**
 * h_hotel
 * @author 
 */
public class HHotel implements Serializable {
    /**
     * 酒店id
     */
    private String id;

    /**
     * 酒店名称
     */
    private String hotelName;

    /**
     * 酒店信息描述
     */
    private String hotelInfo;

    /**
     * 酒店宣传信息
     */
    private String hotelContent;

    /**
     * 酒店所在地
     */
    private String hotelSiteId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public String getHotelContent() {
        return hotelContent;
    }

    public void setHotelContent(String hotelContent) {
        this.hotelContent = hotelContent;
    }

    public String getHotelSiteId() {
        return hotelSiteId;
    }

    public void setHotelSiteId(String hotelSiteId) {
        this.hotelSiteId = hotelSiteId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HHotel other = (HHotel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelName() == null ? other.getHotelName() == null : this.getHotelName().equals(other.getHotelName()))
            && (this.getHotelInfo() == null ? other.getHotelInfo() == null : this.getHotelInfo().equals(other.getHotelInfo()))
            && (this.getHotelContent() == null ? other.getHotelContent() == null : this.getHotelContent().equals(other.getHotelContent()))
            && (this.getHotelSiteId() == null ? other.getHotelSiteId() == null : this.getHotelSiteId().equals(other.getHotelSiteId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHotelName() == null) ? 0 : getHotelName().hashCode());
        result = prime * result + ((getHotelInfo() == null) ? 0 : getHotelInfo().hashCode());
        result = prime * result + ((getHotelContent() == null) ? 0 : getHotelContent().hashCode());
        result = prime * result + ((getHotelSiteId() == null) ? 0 : getHotelSiteId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hotelName=").append(hotelName);
        sb.append(", hotelInfo=").append(hotelInfo);
        sb.append(", hotelContent=").append(hotelContent);
        sb.append(", hotelSiteId=").append(hotelSiteId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}