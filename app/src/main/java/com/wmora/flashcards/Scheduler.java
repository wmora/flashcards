package com.wmora.flashcards;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Scheduler {

    private static final List<Calendar> calendars;
    private static final int REQUEST_CODE = 300;
    private static final long DAY_IN_MILLIS = 60 * 60 * 24 * 1000;

    private Context context;

    static {
        calendars = new ArrayList<>();
        calendars.add(createCalendar(9, 30));
        calendars.add(createCalendar(12, 30));
        calendars.add(createCalendar(15, 30));
        calendars.add(createCalendar(18, 30));
    }

    private static Calendar createCalendar(int hourOfDay, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
        calendar.set(Calendar.MINUTE, minute);
        return calendar;
    }

    public Scheduler(@NonNull Context context) {
        this.context = context;
    }

    public void setUpAlarms() {
        for (int i = 0; i < calendars.size(); i++) {
            Calendar calendar = calendars.get(i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
            Intent intent = new Intent(context, NotificationService.class);
            PendingIntent alarmIntent = PendingIntent.getService(context, REQUEST_CODE + i, intent,
                    PendingIntent.FLAG_UPDATE_CURRENT);
            alarmManager.setInexactRepeating(AlarmManager.RTC, calendar.getTimeInMillis(), DAY_IN_MILLIS,
                    alarmIntent);
        }
    }

}
