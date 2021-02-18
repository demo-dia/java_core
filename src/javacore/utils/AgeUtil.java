package javacore.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by rAGEnchi.Giab on 2020/3/8.
 */
public class AgeUtil {


     public static int calcAge(Date birthday, Date calcDate){

//         Date birthday = xxxxxxxx
         Calendar now = Calendar.getInstance();
         now.setTime(calcDate);
         Calendar b = Calendar.getInstance();
         b.setTime(birthday);
         int year = now.get(Calendar.YEAR) - b.get(Calendar.YEAR);
         int month = now.get(Calendar.MONTH) - b.get(Calendar.MONTH);
         int day = now.get(Calendar.DAY_OF_MONTH) - b.get(Calendar.DAY_OF_MONTH);
         if (month < 0) {
             month = 12 - b.get(Calendar.MONTH) + now.get(Calendar.MONTH);
             year -= 1;
         }
         if (day < 0) {
             day = b.getMaximum(Calendar.DAY_OF_MONTH) - b.get(Calendar.DAY_OF_MONTH) + now.get(Calendar.DAY_OF_MONTH);
             month -= 1;
         }
         // year
         return year;
     }
}
