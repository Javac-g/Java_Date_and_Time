package Vq;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

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
    }
    public static void main(String... args){
        make_date();
        make_time();
        make_date_and_time();
    }
}
