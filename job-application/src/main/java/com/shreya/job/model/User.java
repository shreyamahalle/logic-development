package com.shreya.job.model;

public class User {
    int id;
    String fName;
    String lName;
    String mobileNo;
    String mailId;
    String position;
    String resume;

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

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", mailId='" + mailId + '\'' +
                ", position='" + position + '\'' +
                ", resume='" + resume + '\'' +
                '}';
    }
}


