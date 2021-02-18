package javacore.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算年龄的工具类
 */
public class AgeUtilTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat calcDate=new SimpleDateFormat("yyyy-MM-dd");
        Date calcDay=calcDate.parse("2020-04-14");
        SimpleDateFormat birthDate=new SimpleDateFormat("yyyy-MM-dd");
        Date birthDay=birthDate.parse("1995-05-14");
        int age=AgeUtil.calcAge(birthDay,calcDay);
        System.out.println(age);
    }
}
