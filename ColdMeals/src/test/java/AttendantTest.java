import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class AttendantTest {
    public AttendantTest() {
    }

    @Test
    public void cold_meal_attendant_returns_false_when_arrival_before_9_pm_at_5_am() {
        Attendant attendant = new Attendant(LocalDateTime.of(2019, 10, 17, 5, 0));
        Assertions.assertThat(attendant.arrivedAfter(ColdMealsServerTest.LIMIT_ARRIVAL_DATE)).isFalse();
    }
}