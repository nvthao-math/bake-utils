/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bake.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author bigdata
 */
public class TimeUtils {

    public static String formatDateAsString(Date date, String type) throws Exception {
        DateFormat df = new SimpleDateFormat(type);
        String result = df.format(date);
        return result;
    }

    public static String formatLongAsString(long time, String type) throws Exception {
        DateFormat df = new SimpleDateFormat(type);
        String result = df.format(new Date(time));
        return result;
    }

    public static Date formatStringAsDate(String str, String pattern) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.parse(str);
    }

    public static int getYear(long time) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(Calendar.YEAR);
    }

    public static int getMonth(long time) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(Calendar.MONTH);
    }

    public static int getDay(long time) throws Exception { // thu trong tuan
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static int getDate(long time) throws Exception { // thu trong tuan
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(Calendar.DATE);
    }

    public static int getHour(long time) throws Exception { // thu trong tuan
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public static int getMinutes(long time) throws Exception { // thu trong tuan
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(Calendar.MINUTE);
    }

//    public static void main(String[] args) throws Exception {
//        String time = "2018-04-28";
//        long date = formatStringAsDate(time, "yyyy-MM-dd").getTime();
//        int day = getDay(date);
//        System.out.println(day);
//    }
}
