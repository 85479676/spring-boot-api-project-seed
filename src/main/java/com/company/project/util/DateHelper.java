package com.company.project.util;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @Ttron 2017年8月15日
 */
public class DateHelper {
    private static final DateFormat FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");

    private static final DateFormat FORMAT_ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final DateFormat FORMAT_DATE = new SimpleDateFormat("yyyy-MM-dd");

    private static final DateFormat FORMAT_ISO8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");


    /**
     * @param date
     * @return date-now=? days
     * @throws ParseException
     */
    public static int dateDiff(String date) throws ParseException {
        Calendar calendar0 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar1.setTime(FORMAT_DATE.parse(date));
        } catch (ParseException e) {
            throw e;
        }
        long diff = calendar0.getTimeInMillis() - calendar1.getTimeInMillis();
        int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
        return diffDays;
    }


    /**
     * @param future
     * @param past
     * @return future-past=? days
     * @throws ParseException
     */
    public static int dateDiff(String future, String past) throws ParseException {
        Calendar calendar0 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar0.setTime(FORMAT_DATE.parse(future));
        } catch (ParseException e) {
            throw e;
        }

        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar1.setTime(FORMAT_DATE.parse(past));
        } catch (ParseException e) {
            throw e;
        }
        long diff = calendar0.getTimeInMillis() - calendar1.getTimeInMillis();
        int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
        return diffDays;
    }


    /**
     * @param timestamp
     * @return
     * @throws ParseException
     */
    public static long fromTimestamp(Timestamp timestamp) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        calendar.setTime(timestamp);
        return calendar.getTimeInMillis();
    }


    /**
     * @param datime 2008-09-01 15:25:14
     * @return
     * @throws ParseException
     */
    public static long fromYYYY_MM_DD(String datime) throws ParseException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar.setTime(FORMAT_.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return calendar.getTimeInMillis();
    }


    /**
     * @param datime 2008-09-01T15:25:14
     * @return
     */
    public static long fromYYYY_MM_DD_ISO8601(String datime) throws ParseException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar.setTime(FORMAT_ISO8601.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return calendar.getTimeInMillis();
    }


    /**
     * @param datime 2008-09-01 15:25:14
     * @return 2008-09-01 23:59:59
     * @throws ParseException
     */
    public static String fromYYYY_MM_DD_MAX(String datime) throws ParseException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar.setTime(FORMAT_.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return String.format("%1$tY-%1$tm-%1$td 23:59:59", calendar);
    }


    /**
     * @param datime 2008-09-01 15:25:14
     * @return 2008-09-01 00:00:00
     * @throws ParseException
     */
    public static String fromYYYY_MM_DD_MIN(String datime) throws ParseException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar.setTime(FORMAT_.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return String.format("%1$tY-%1$tm-%1$td 00:00:00", calendar);
    }


    /**
     * @param datime 2008-09-01 15:25:14
     * @return
     * @throws ParseException
     */
    public static Calendar fromYYYY_MM_DDToCaldenar(String datime) throws ParseException {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            calendar.setTime(FORMAT_.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return calendar;
    }


    /**
     * @param datime 200802021515115
     * @return
     */
    public static long fromYYYYMMDDToMillis(String datime) throws ParseException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            cal.setTime(FORMAT.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return cal.getTimeInMillis();
    }


    /**
     * @param datime 200802021515115
     * @return 2008-09-01T15:25:14
     */
    public static String fromYYYYMMDDToYYYY_MM_DD(String datime) throws ParseException {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
        try {
            cal.setTime(FORMAT.parse(datime));
        } catch (ParseException e) {
            throw e;
        }
        return getDateYYYY_MM_DD(cal);
    }


    /**
     * 返回当前时间
     *
     * @return 2008-09-01T15:25:14
     */
    public static String getDateISO8601() {
        return getDateISO8601(Calendar.getInstance());
    }


    /**
     * @param calendar
     * @return 2008-09-01T15:25:14
     */
    public static String getDateISO8601(Calendar calendar) {
        return String.format("%1$tY-%1$tm-%1$tdT%1$tH:%1$tM:%1$tS", calendar);
    }


    /**
     * 返回当前时间
     *
     * @return 2008-09-01 15:25:14
     */
    public static String getDateYYYY_MM_DD() {
        return getDateYYYY_MM_DD(Calendar.getInstance());
    }


    /**
     * @param calendar
     * @return 2008-09-01 15:25:14
     */
    public static String getDateYYYY_MM_DD(Calendar calendar) {
        return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", calendar);
    }


    /**
     * @param date
     * @return 2008-09-01 15:25:14
     */
    public static String getDateYYYY_MM_DD(Date date) {
        return FORMAT_.format(date);
    }


    public static String getDateYYYY_MM_DD(int year, int month, int day, int hour, int minute, int second) {
        return String.format("%1$04d-%2$02d-%3$02d %4$02d:%5$02d:%6$02d", year, month, day, hour, minute, second);
    }


    /**
     * 转换时间格式
     *
     * @param millis
     * @return 2008-09-01 15:25:14
     */
    public static String getDateYYYY_MM_DD(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", calendar);
    }


    /**
     * 返回当日时间
     *
     * @return 2008-09-01 23:59:59
     */
    public static String getDateYYYY_MM_DD_MAX() {
        return String.format("%1$tY-%1$tm-%1$td 23:59:59", Calendar.getInstance());
    }


    /**
     * 返回当日时间
     *
     * @return 2008-09-01 00:00:00
     */
    public static String getDateYYYY_MM_DD_MIN() {
        return String.format("%1$tY-%1$tm-%1$td 00:00:00", Calendar.getInstance());
    }


    /**
     * @return 2008-09-01 15:25:14.111
     */
    public static String getDateYYYY_MM_DD_SSS() {
        return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL", Calendar.getInstance());
    }


    /**
     * @param calendar
     * @return 2008-09-01 15:25:14.111
     */
    public static String getDateYYYY_MM_DD_SSS(Calendar calendar) {
        return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL", calendar);
    }


    /**
     * @return 2008-09-01 15:25:14.111
     */
    public static String getDateYYYY_MM_DD_SSS(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL", calendar);
    }


    /**
     * 返回当前时间
     *
     * @return 200802021515115
     */
    public static String getDateYYYYMMDD() {
        return getDateYYYYMMDD(Calendar.getInstance());
    }


    /**
     * @param calendar
     * @return 200802021515115
     */
    public static String getDateYYYYMMDD(Calendar calendar) {
        return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", calendar);
    }


    /**
     * 转换时间格式
     *
     * @param millis
     * @return 20081231235959
     */
    public static String getDateYYYYMMDD(long millis) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(millis);
        return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", cal);
    }


    /**
     * @param
     * @return
     * @throws ParseException
     */
    public static Date toDate(long epochMilli) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(epochMilli);
        return calendar.getTime();
    }
}
