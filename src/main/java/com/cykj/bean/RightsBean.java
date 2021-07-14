package com.cykj.bean;

public class RightsBean {

  private long rightsId;
  private String rightsNumber;
  private String rightsName;
  private String positionNumber;
  private String fatherNumber;


  public long getRightsId() {
    return rightsId;
  }

  public void setRightsId(long rightsId) {
    this.rightsId = rightsId;
  }


  public String getRightsNumber() {
    return rightsNumber;
  }

  public void setRightsNumber(String rightsNumber) {
    this.rightsNumber = rightsNumber;
  }


  public String getRightsName() {
    return rightsName;
  }

  public void setRightsName(String rightsName) {
    this.rightsName = rightsName;
  }


  public String getPositionNumber() {
    return positionNumber;
  }

  public void setPositionNumber(String positionNumber) {
    this.positionNumber = positionNumber;
  }


  public String getFatherNumber() {
    return fatherNumber;
  }

  public void setFatherNumber(String fatherNumber) {
    this.fatherNumber = fatherNumber;
  }

  @Override
  public String toString() {
    return "RightsBean{" +
            "rightsId=" + rightsId +
            ", rightsNumber='" + rightsNumber + '\'' +
            ", rightsName='" + rightsName + '\'' +
            ", positionNumber='" + positionNumber + '\'' +
            ", fatherNumber='" + fatherNumber + '\'' +
            '}';
  }
}
