package Vq;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void make_date(){
        LocalDate ld1 = LocalDate.of(2024,12,12);
        LocalDate ld2 = LocalDate.of(2024, Month.OCTOBER, 12);
        LocalDate ld3 = LocalDate.now();

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
    }
    public static void main(String... args){
        make_date();
    }
}
