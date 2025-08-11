package com.shreya.healthcare.model;

public class Nurse {
    private int id;
    private String name;
    private String lName;

    @Override
    public String toString() {
        return "Nurse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
