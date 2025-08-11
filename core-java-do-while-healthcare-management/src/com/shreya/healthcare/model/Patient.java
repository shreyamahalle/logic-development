package com.shreya.healthcare.model;

public class Patient {
    private int id;
    private String fName;
    private String lName;
    private String mobileNo;
    private String alternativeMobileNo;
    private String address;
    private String paymentDetails;
    private int age;
    private String gender;


    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", alternativeMobileNo='" + alternativeMobileNo + '\'' +
                ", address='" + address + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAlternativeMobileNo() {
        return alternativeMobileNo;
    }

    public void setAlternativeMobileNo(String alternativeMobileNo) {
        this.alternativeMobileNo = alternativeMobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
