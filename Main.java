import java.time.*;

public class Main {
    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
// check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    private static void performAimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) {
// uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
// adds the period
        }}
    public static void main(String... args){
        LocalDate date1 = LocalDate.of(1992, 12,12);
        LocalDate date2 = LocalDate.of(1222, Month.JULY, 17);
        LocalDate date3 = LocalDate.now();

        LocalTime time1 = LocalTime.of(7,15);
        LocalTime time2 = LocalTime.of(7,15,30);
        LocalTime time3 = LocalTime.of(7,15,30,200);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

        Period period = Period.ofMonths(1);
// create a period
        performAimalEnrichment(start, end, period);




        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}
