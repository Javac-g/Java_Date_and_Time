import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

        Long millis = System.currentTimeMillis();
        Date date = new Date(millis);

        LocalDate localDate = LocalDate.of(2026,1,6);
        Date date11 = Date.from( localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

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

    public  static void two(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.YEAR, 2026);
        calendar.set(Calendar.MONTH,1);
        calendar.set(Calendar.DAY_OF_MONTH,1);

        System.out.print(calendar.get(Calendar.YEAR) + " - ");
        System.out.print(calendar.get(Calendar.MONTH) + " - ");
        System.out.print(calendar.get(Calendar.DAY_OF_MONTH));

    }
    public static void three(){
        LocalDate localDate = LocalDate.of(2021, 12,23);
        localDate = localDate.plusYears(2).plusMonths(5).plusDays(25);
        System.out.println(localDate);
    }
}
