package javacore.ch04;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate myDate=LocalDate.of(1999,12,31);
        LocalDate aThousandDaysLater=myDate.plusDays(1000);
        System.out.println(aThousandDaysLater);
        LocalDate my=LocalDate.now();
        System.out.println(my);
        int year=my.getYear();
        int month=my.getMonthValue();
        int day=my.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        LocalDate my1=my.plusDays(-8);
        System.out.println(my1);

    }
}
