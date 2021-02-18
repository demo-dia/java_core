package javacore.utils;

import cn.hutool.core.date.DateTime;
import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        DateTime date = DateTime.now();
        System.out.println(date);

        Date time = new Date();
        System.out.println(time);

        DateTime now1 = DateTime.of("2021-01-01 14:00:00","yyyy-MM-dd hh:mm:ss");
        System.out.println(now1);
    }
}
