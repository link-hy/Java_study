package com.lin.bean;

import java.util.Date;

/**
 * Movie类包含：片名、主演、评分、时长、票价、余票、上映时间
 */
public class movie {
    private String name;
    private String mainActos;
    private double score;
    private double time;
    private double price;
    private int numOfmov;
    private Date starTime;

    public movie() {
    }

    public movie(String name, String mainActos, double score, double time,
                 double price, int numOfmov, Date starTime) {
        this.name = name;
        this.mainActos = mainActos;
        this.score = score;
        this.time = time;
        this.price = price;
        this.numOfmov = numOfmov;
        this.starTime = starTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainActos() {
        return mainActos;
    }

    public void setMainActos(String mainActos) {
        this.mainActos = mainActos;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumOfmov() {
        return numOfmov;
    }

    public void setNumOfmov(int numOfmov) {
        this.numOfmov = numOfmov;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", mainActos='" + mainActos + '\'' +
                ", score=" + score +
                ", time=" + time +
                ", price=" + price +
                ", numOfmov=" + numOfmov +
                ", starTime=" + starTime +
                '}';
    }
}
