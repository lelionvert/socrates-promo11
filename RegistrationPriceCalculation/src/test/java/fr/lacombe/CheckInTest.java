package fr.lacombe;

import org.junit.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckInTest {

    @Test
    public void format_date_with_day_thursday() {
        CheckIn check = new CheckIn("2019-10-17 21:00");

        assertThat(check.getDay()).isEqualTo(DayOfWeek.THURSDAY);
    }
    @Test
    public void format_date_with_day_friday() {
        CheckIn check = new CheckIn("2019-10-18 07:00");

        assertThat(check.getDay()).isEqualTo(DayOfWeek.FRIDAY);
    }
}
