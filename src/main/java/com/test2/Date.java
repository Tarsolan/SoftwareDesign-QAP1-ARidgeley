package com.test2;

public class Date {
    private int day, month, year;

    // Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    @Override
    public String toString(){
        String dayFormat = String.valueOf(getDay()), monthFormat = String.valueOf(getMonth());
        if (getDay() < 10) dayFormat = "0" + dayFormat;
        if (getMonth() < 10) monthFormat = "0" + monthFormat;

        return dayFormat + "/" + monthFormat + "/" + getYear();
    }

    public String toString(int type){
        String dayFormat = String.valueOf(getDay()), monthFormat = String.valueOf(getMonth());
        if (getDay() < 10) dayFormat = "0" + dayFormat;
        if (getMonth() < 10) monthFormat = "0" + monthFormat;

        return switch (type) {
            case 1 -> getYear() + "/" + monthFormat + "/" + dayFormat;
            case 2 -> monthFormat + "/" + dayFormat + "/" + getYear();
            default -> dayFormat + "/" + monthFormat + "/" + getYear();
        };

    }
}
