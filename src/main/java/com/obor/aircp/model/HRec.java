package com.obor.aircp.model;

import java.io.Serializable;

/**
 * h_rec
 * @author 
 */
public class HRec implements Serializable {
    /**
     * 地点编号
     */
    private String id;

    /**
     * 地点精选名称
     */
    private String cityRecName;

    /**
     * 地点精选描述
     */
    private String cityRecContext;

    /**
     * 地点评论
     */
    private String cityComment;

    /**
     * 地点ID
     */
    private String cityId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityRecName() {
        return cityRecName;
    }

    public void setCityRecName(String cityRecName) {
        this.cityRecName = cityRecName;
    }

    public String getCityRecContext() {
        return cityRecContext;
    }

    public void setCityRecContext(String cityRecContext) {
        this.cityRecContext = cityRecContext;
    }

    public String getCityComment() {
        return cityComment;
    }

    public void setCityComment(String cityComment) {
        this.cityComment = cityComment;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
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
        HRec other = (HRec) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCityRecName() == null ? other.getCityRecName() == null : this.getCityRecName().equals(other.getCityRecName()))
            && (this.getCityRecContext() == null ? other.getCityRecContext() == null : this.getCityRecContext().equals(other.getCityRecContext()))
            && (this.getCityComment() == null ? other.getCityComment() == null : this.getCityComment().equals(other.getCityComment()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCityRecName() == null) ? 0 : getCityRecName().hashCode());
        result = prime * result + ((getCityRecContext() == null) ? 0 : getCityRecContext().hashCode());
        result = prime * result + ((getCityComment() == null) ? 0 : getCityComment().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cityRecName=").append(cityRecName);
        sb.append(", cityRecContext=").append(cityRecContext);
        sb.append(", cityComment=").append(cityComment);
        sb.append(", cityId=").append(cityId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}