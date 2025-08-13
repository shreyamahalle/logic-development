package com.shreya.healthcare.model;

public class Address {
    private String Address;
    private int pinCode;
    private String landMark;
    private String buildingName;
    private String wing;
    private int buildingNo;

    @Override
    public String toString() {
        return "Address{" +
                "Address='" + Address + '\'' +
                ", pinCode=" + pinCode +
                ", landMark='" + landMark + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", wing='" + wing + '\'' +
                ", buildingNo=" + buildingNo +
                '}';
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }
}
