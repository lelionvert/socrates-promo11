package fr.lacombe;

import org.junit.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckOutTest {

    @Test
    public void format_date_with_day_saturday() {
        CheckOut check = new CheckOut("2019-10-19 18:00");

        assertThat(check.getDay()).isEqualTo(DayOfWeek.SATURDAY);
    }

}
