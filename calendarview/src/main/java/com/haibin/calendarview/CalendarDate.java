package com.haibin.calendarview;

import java.io.Serializable;

public class CalendarDate implements Serializable {
    private static final long serialVersionUID = 1L;
    public int year;
    public int month;  //1~12
    public int day;

    public CalendarDate(int year, int month, int day) {
        if (month > 12) {
            month = 1;
            year++;
        } else if (month < 1) {
            month = 12;
            year--;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public CalendarDate() {
    }


    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder().append(year).append("-");
        if (month < 10) {
            temp.append("0");
        }
        temp.append(month).append("-");
        if (day < 10) {
            temp.append("0");
        }
        temp.append(day);
        return temp.toString();
        //return year + "-" + month + "-" + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getZeroDay() {
        if (day < 10) {
            return "0" + day;
        } else {
            return "" + day;
        }
    }

    public String getZeroMonth() {
        if (month < 10) {
            return "0" + month;
        } else {
            return "" + month;
        }
    }

    public boolean equals(CalendarDate date) {
        if (date == null) {
            return false;
        }
        if (this.getYear() == date.getYear()
                && this.getMonth() == date.getMonth()
                && this.getDay() == date.getDay()) {
            return true;
        }
        return false;
    }

    public CalendarDate cloneSelf() {
        return new CalendarDate(year, month, day);
    }

}