package Vq;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void make_date(){
        LocalDate ld1 = LocalDate.of(2024,12,12);
        LocalDate ld2 = LocalDate.of(2024, Month.OCTOBER, 12);
        LocalDate ld3 = LocalDate.now();

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
    }
    public static void make_time(){
        LocalTime lt1 = LocalTime.of(23,12);
        LocalTime lt2 = LocalTime.of(23,12, 45);
        LocalTime lt3 = LocalTime.of(23,12, 45,100);
        LocalTime lt4 = LocalTime.now();

        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
    }
    public static void make_date_and_time(){
        LocalDateTime ldt1 = LocalDateTime.of(2024,Month.OCTOBER,24,2,20);
        LocalDateTime ldt2 = LocalDateTime.of(2024,Month.OCTOBER,24,2,20,10);
        LocalDateTime ldt3 = LocalDateTime.of(2024,Month.OCTOBER,24,2,20,10,200);
        LocalDateTime ldt4 = LocalDateTime.now();

        LocalTime lt = LocalTime.now();
        LocalDate ld = LocalDate.now();
        LocalDateTime lcdq = LocalDateTime.of(ld,lt);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println(lcdq);
    }

    public static void date_instance(){
        Date date = new Date(275647648484L);
        System.out.println(date);
    }

    public static void calendar(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.MONTH, 12);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + ".");
        System.out.print(calendar.get(Calendar.MONTH) + ".");
        System.out.print(calendar.get(Calendar.YEAR));
    }

    public static void operations(){
        LocalDate date = LocalDate.of(2017, Month.NOVEMBER, 8);
        date.plusYears(2).plusMonths(3).plusDays(4);
        LocalDate date2 = date.plusYears(2).plusMonths(3).plusDays(4);;

        System.out.println();
        System.out.println(date);
        System.out.println(date2);
    }
    public static void main(String... args){
        make_date();
        make_time();
        make_date_and_time();
        date_instance();
        calendar();
        operations();
    }
}
