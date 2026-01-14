import java.time.LocalDate;
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

}
