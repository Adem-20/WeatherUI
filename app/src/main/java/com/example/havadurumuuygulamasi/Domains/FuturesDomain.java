package com.example.havadurumuuygulamasi.Domains;

public class FuturesDomain {
    private String day;
    private String picPath ;
    private String status ;
    private int highTemp;
    private int lowTemp;

    public FuturesDomain(String day, int lowTemp, int highTemp, String status, String picPath) {
        this.day = day;
        this.lowTemp = lowTemp;
        this.highTemp = highTemp;
        this.status = status;
        this.picPath = picPath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(int highTemp) {
        this.highTemp = highTemp;
    }

    public int getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(int lowTemp) {
        this.lowTemp = lowTemp;
    }
}
