package com.shreya.job.model;

public class Review {
    public int id;
    public String heading;
    public int star;

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", heading='" + heading + '\'' +
                ", star=" + star +
                '}';
    }
}
