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
        //Test.one();
       // Test.two();
        Test.three();
    }
}
