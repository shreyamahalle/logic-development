package com.shreya.healthcare.model;

public class Billing {
    private int id;
    private int pId;
    private int totalTax;
    private int totalBill;

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", pId=" + pId +
                ", totalTax=" + totalTax +
                ", totalBill=" + totalBill +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(int totalTax) {
        this.totalTax = totalTax;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
