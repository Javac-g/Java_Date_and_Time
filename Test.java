import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {
    public static void one(){

        LocalTime time1 = LocalTime.of(5,20);
        LocalTime time2 = LocalTime.of(13 ,20,25);
        LocalTime time3 = LocalTime.of(23,10,59,100000000);
        LocalTime time = LocalTime.now();

        LocalDate date1 = LocalDate.of(2000,3,17);
        LocalDate date2 = LocalDate.of(2002, Month.JULY, 20);
        LocalDate date3 = LocalDate.now();

        LocalDateTime ldt1 = LocalDateTime.of(2002,12,22,13,46, 50,100);
        LocalDateTime ldt2 = LocalDateTime.of(date2,time3);
        LocalDateTime ldt3 = LocalDateTime.now();

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Time 3: " + time3);
        System.out.println("Time now: " + time);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date now: " + date3);

        System.out.println("Local Date and Time 1: " + ldt1);
        System.out.println("Local Date and Time 2: " + ldt2);
        System.out.println("Local Date and Time now: " + ldt3);

    }
}
