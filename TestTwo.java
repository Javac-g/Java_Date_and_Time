import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TestTwo {
    LocalTime t1 = LocalTime.of(5,25);
    LocalTime t2 = LocalTime.of(5,25, 60);
    LocalTime t3 = LocalTime.of(5,25, 60,100);
    LocalTime t4 = LocalTime.now();

    LocalDate d1 = LocalDate.of(2025,12,2);
    LocalDate d2 = LocalDate.of(2025, Month.OCTOBER,2);
    LocalDate d3 = LocalDate.now();

    LocalDateTime dt1 = LocalDateTime.of(d1,t1);
    LocalDateTime dt2 = LocalDateTime.of(2021,10,10,10,30);
    LocalDateTime dt3 = LocalDateTime.of(2021,10,10,10,30, 60);
    LocalDateTime dt4 = LocalDateTime.of(2021,10,10,10,30, 60,200);
    LocalDateTime dt5 = LocalDateTime.now();

}
