package fr.lacombe;

import org.junit.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class DateEngineTest {

    @Test
    public void format_date_with_day_thursday() {
        DateEngine date = new DateEngine("2019-10-17 21:00");

        assertThat(date.getDay()).isEqualTo(DayOfWeek.THURSDAY);
    }

    @Test
    public void format_date_with_day_saturday() {
        DateEngine date = new DateEngine("2019-10-19 18:00");

        assertThat(date.getDay()).isEqualTo(DayOfWeek.SATURDAY);
    }
}
