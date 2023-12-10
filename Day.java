package hw_9;

/**
 * task 5.21
 * @author Pisnia Mariia
 */

import java.util.Calendar;

class Hour {
    private int hour;
    public Hour(int hour) {this.hour = hour;}
    public int getHour() {return hour;}
}

class Minute {
    private int minute;
    public Minute(int minute) {this.minute = minute;}
    public int getMinute() {return minute;}
}

public class Day {
    private Hour hour;
    private Minute minute;

    public Day(int hour, int minute) {
        this.hour = new Hour(hour);
        this.minute = new Minute(minute);
    }

    public void displayTime() {
        System.out.println("Current time: " + hour.getHour() + ":" + String.format("%02d", minute.getMinute()));
    }

    public void displayDaytime() {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay >= 6 && hourOfDay < 12) {
            System.out.println("Morning");
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            System.out.println("Afternoon");
        } else if (hourOfDay >= 18 && hourOfDay < 24) {
            System.out.println("Evening");
        } else {
            System.out.println("Night");
        }
    }
    public static void main(String[] args) {
        Day day = new Day(15, 30);
        day.displayTime();
        day.displayDaytime();
    }
}
