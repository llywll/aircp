package com.obor.aircp.model;

import java.io.Serializable;

/**
 * h_service
 * @author 
 */
public class HService implements Serializable {
    /**
     * 套餐ID
     */
    private String id;

    /**
     * 套餐名称
     */
    private String serviceName;

    /**
     * 套餐描述
     */
    private String serviceInfo;

    /**
     * 套餐金额
     */
    private String serviceMoney;

    /**
     * 套餐类型
     */
    private String serviceType;

    /**
     * 所属酒店ID
     */
    private String hotelId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(String serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public String getServiceMoney() {
        return serviceMoney;
    }

    public void setServiceMoney(String serviceMoney) {
        this.serviceMoney = serviceMoney;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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
        HService other = (HService) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServiceName() == null ? other.getServiceName() == null : this.getServiceName().equals(other.getServiceName()))
            && (this.getServiceInfo() == null ? other.getServiceInfo() == null : this.getServiceInfo().equals(other.getServiceInfo()))
            && (this.getServiceMoney() == null ? other.getServiceMoney() == null : this.getServiceMoney().equals(other.getServiceMoney()))
            && (this.getServiceType() == null ? other.getServiceType() == null : this.getServiceType().equals(other.getServiceType()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        result = prime * result + ((getServiceInfo() == null) ? 0 : getServiceInfo().hashCode());
        result = prime * result + ((getServiceMoney() == null) ? 0 : getServiceMoney().hashCode());
        result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceName=").append(serviceName);
        sb.append(", serviceInfo=").append(serviceInfo);
        sb.append(", serviceMoney=").append(serviceMoney);
        sb.append(", serviceType=").append(serviceType);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}