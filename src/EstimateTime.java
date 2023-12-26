import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class EstimateTime {
    public static void main(String[] args) {
        Gigasecond gigaSecond = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));
        System.out.printf("Original time 25 April 2011 after giga second: %s%n",gigaSecond.getDateTime());
        gigaSecond = new Gigasecond(LocalDate.of(1959, Month.JULY, 19));
        System.out.printf("Original time 19 July 1959 after giga second: %s%n", gigaSecond.getDateTime());
        gigaSecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
        System.out.printf("Original time 24 January 2015 22:00 after giga second: %s%n", gigaSecond.getDateTime());
    }
}
