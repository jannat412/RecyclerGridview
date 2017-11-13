package com.jannat.recyclergridview;

/**
 * Created by Jannat Mostafiz on 11/14/2017.
 */

public class DataModel {
    String month;
    String startDate;
    String endDate;
    int id;

    public DataModel(String month, String startDate, String endDate, int id) {
        this.month = month;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;

    }
    public DataModel(){}

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
