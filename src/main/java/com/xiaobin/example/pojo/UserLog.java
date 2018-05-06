package com.xiaobin.example.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_user_log
 * @author 
 */
public class UserLog implements Serializable {
    /**
     * 登录id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 登录总次数
     */
    private Integer loginStat;

    /**
     * 登录错误次数
     */
    private Integer loginErrorCount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLoginStat() {
        return loginStat;
    }

    public void setLoginStat(Integer loginStat) {
        this.loginStat = loginStat;
    }

    public Integer getLoginErrorCount() {
        return loginErrorCount;
    }

    public void setLoginErrorCount(Integer loginErrorCount) {
        this.loginErrorCount = loginErrorCount;
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
        UserLog other = (UserLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getLoginTime() == null ? other.getLoginTime() == null : this.getLoginTime().equals(other.getLoginTime()))
            && (this.getLoginStat() == null ? other.getLoginStat() == null : this.getLoginStat().equals(other.getLoginStat()))
            && (this.getLoginErrorCount() == null ? other.getLoginErrorCount() == null : this.getLoginErrorCount().equals(other.getLoginErrorCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getLoginTime() == null) ? 0 : getLoginTime().hashCode());
        result = prime * result + ((getLoginStat() == null) ? 0 : getLoginStat().hashCode());
        result = prime * result + ((getLoginErrorCount() == null) ? 0 : getLoginErrorCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginStat=").append(loginStat);
        sb.append(", loginErrorCount=").append(loginErrorCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}