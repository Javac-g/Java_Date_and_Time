import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class Main {

    public static void main(String... args){
        LocalDate date1 = LocalDate.of(1992, 12,12);
        LocalDate date2 = LocalDate.of(1222, Month.JULY, 17);
        LocalDate date3 = LocalDate.now();

        LocalTime time1 = LocalTime.of(7,15);
        LocalTime time2 = LocalTime.of(7,15,30);
        LocalTime time3 = LocalTime.of(7,15,30,200);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
