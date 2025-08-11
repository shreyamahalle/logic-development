package com.shreya.healthcare.model;

public class Doctor {
    private int doctorId;
    private String docName;
    private String docLName;
    private String docMobileNo;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", docName='" + docName + '\'' +
                ", docLName='" + docLName + '\'' +
                ", docMobileNo='" + docMobileNo + '\'' +
                '}';
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocLName() {
        return docLName;
    }

    public void setDocLName(String docLName) {
        this.docLName = docLName;
    }

    public String getDocMobileNo() {
        return docMobileNo;
    }

    public void setDocMobileNo(String docMobileNo) {
        this.docMobileNo = docMobileNo;
    }
}
