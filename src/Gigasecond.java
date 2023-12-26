import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDate momentDate;

    private LocalDateTime momentDateTime;

    public Gigasecond(LocalDate moment) {
        this.momentDate = moment;
    }

    public Gigasecond(LocalDateTime moment) {
      this.momentDateTime = moment;
    }

    public LocalDateTime getDateTime() {
        final long GIGA_SECOND = 1000_000_000;
        if(momentDateTime == null){
           return momentDate.atStartOfDay().plusSeconds(GIGA_SECOND);
        }
        return momentDateTime.plusSeconds(GIGA_SECOND);
    }
}