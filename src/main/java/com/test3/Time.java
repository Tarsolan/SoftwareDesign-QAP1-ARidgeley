package com.test3;

public class Time {
    private int hour, minute, second;

    // Constructor
    Time(){
        this.hour = 1;
        this.minute = 1;
        this.second = 1;
    }
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Methods
    @Override
    public String toString(){
        String hourFormat = String.valueOf(getHour()), minuteFormat = String.valueOf(getMinute()), secondFormat = String.valueOf(getSecond());
        if (getHour() < 10) hourFormat = "0" + hourFormat;
        if (getMinute() < 10) minuteFormat = "0" + minuteFormat;
        if (getSecond() < 10) secondFormat = "0" + secondFormat;

        return hourFormat + ":" + minuteFormat + ":" + secondFormat;
    }

    public Time nextSecond(){
        setSecond(getSecond() + 1);
        return this;
    }

    public Time previousSecond(){
        setSecond(getSecond() - 1);
        return this;
    }

    // Getters and Setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour == 24){
            this.hour = 0;
        } else if (hour == -1){
            this.hour = 23;
        } else this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute == 60){
            this.minute = 0;
            setHour(getHour() + 1);
        } else if (minute == -1){
            this.minute = 59;
            setHour(getHour() - 1);
        } else this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second == 60) {
            this.second = 0;
            setMinute(getMinute() + 1);
        } else if (second == -1){
            this.second = 59;
            setMinute(getMinute() -1);
        } else this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
}
