package com.obor.aircp.model;

import java.io.Serializable;

/**
 * h_comment
 * @author 
 */
public class HComment implements Serializable {
    /**
     * 评论ID
     */
    private String id;

    /**
     * 所属酒店id
     */
    private String hotelId;

    /**
     * 所属用户id
     */
    private String userId;

    /**
     * 评论内容
     */
    private String commentContext;

    /**
     * 评论类别
     */
    private String commentType;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext;
    }

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
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
        HComment other = (HComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCommentContext() == null ? other.getCommentContext() == null : this.getCommentContext().equals(other.getCommentContext()))
            && (this.getCommentType() == null ? other.getCommentType() == null : this.getCommentType().equals(other.getCommentType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCommentContext() == null) ? 0 : getCommentContext().hashCode());
        result = prime * result + ((getCommentType() == null) ? 0 : getCommentType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", userId=").append(userId);
        sb.append(", commentContext=").append(commentContext);
        sb.append(", commentType=").append(commentType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}