package com.obor.aircp.model;

import java.io.Serializable;

/**
 * s_user
 * @author 
 */
public class SUser implements Serializable {
    /**
     * id
     */
    private String sId;

    /**
     * 用户名
     */
    private String sUserName;

    /**
     * 用户密码
     */
    private String sPassword;

    private static final long serialVersionUID = 1L;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
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
        SUser other = (SUser) that;
        return (this.getsId() == null ? other.getsId() == null : this.getsId().equals(other.getsId()))
            && (this.getsUserName() == null ? other.getsUserName() == null : this.getsUserName().equals(other.getsUserName()))
            && (this.getsPassword() == null ? other.getsPassword() == null : this.getsPassword().equals(other.getsPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getsId() == null) ? 0 : getsId().hashCode());
        result = prime * result + ((getsUserName() == null) ? 0 : getsUserName().hashCode());
        result = prime * result + ((getsPassword() == null) ? 0 : getsPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sUserName=").append(sUserName);
        sb.append(", sPassword=").append(sPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}