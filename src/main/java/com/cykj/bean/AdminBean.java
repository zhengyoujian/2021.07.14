package com.cykj.bean;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/12 22:30
 * @desc:
 */
public class AdminBean {
    private int adminId;
    private String adminName;
    private String account;
    private String password;
    private String positionId;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }


    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    @Override
    public String toString() {
        return "AdminBean{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", positionId='" + positionId + '\'' +
                '}';
    }
}
