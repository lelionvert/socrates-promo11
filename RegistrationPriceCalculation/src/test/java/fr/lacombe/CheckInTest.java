package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CheckInTest {

    @Test
    public void format_date_with_days() {
        CheckIn check = new CheckIn("2019-10-17 21:00");

        Assertions.assertThat(check.getDay()).isEqualTo("Thursday");
    }
}
