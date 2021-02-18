package javacore.utils;


import cn.hutool.core.date.LocalDateTimeUtil;

import java.time.LocalDateTime;
import java.util.Calendar;

public class TimeTest {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        System.out.println(LocalDateTimeUtil.format(now,"M:dd"));//错误，月日
        System.out.println(LocalDateTimeUtil.format(now,"MM:dd"));
        System.out.println(LocalDateTimeUtil.format(now,"hh:mm"));//时分

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

    }
}
