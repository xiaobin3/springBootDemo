package com.xiaobin.example.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xiaobin3
 * @Description:时间转换工具包
 * @Date: Created in 18:32 2018/5/6
 * @Modified by:
 */
public class DateUtil {
    public static final String DateTime24h = "yyyy-MM-dd HH:mm:ss";
    public static final String DateTime12h = "yyyy-MM-dd hh:mm:ss";
    public static final String dateFormat = "yyyy-MM-dd";
    public static final String timeFormat = "HH:mm:ss";

    /**
     * 格式化Date to yyyy-MM-dd HH:mm:ss
     *
     * @return String
     */
    public static String dateTimeToString(Date dateTime) throws Exception {
        DateFormat df = new SimpleDateFormat(DateTime24h);
        return df.format(dateTime);
    }

    /**
     * 格式化yyyy-MM-dd HH:mm:ss to Date
     *
     * @return Date
     */
    public static Date stringToDateTime(String dateTime) throws Exception {
        DateFormat df = new SimpleDateFormat(DateTime24h);
        return df.parse(dateTime);
    }

}
