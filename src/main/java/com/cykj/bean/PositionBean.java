package com.cykj.bean;

public class PositionBean {

  private int positionId;
  private String positionNumber;
  private String positionName;


  public long getPositionId() {
    return positionId;
  }

  public void setPositionId(int positionId) {
    this.positionId = positionId;
  }


  public String getPositionNumber() {
    return positionNumber;
  }

  public void setPositionNumber(String positionNumber) {
    this.positionNumber = positionNumber;
  }


  public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }

  @Override
  public String toString() {
    return "PositionBean{" +
            "positionId=" + positionId +
            ", positionNumber='" + positionNumber + '\'' +
            ", positionName='" + positionName + '\'' +
            '}';
  }
}
