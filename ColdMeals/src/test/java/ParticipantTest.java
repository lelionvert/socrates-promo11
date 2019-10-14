import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class ParticipantTest {
    private static final LocalDateTime LIMIT_ARRIVAL_DATE = LocalDateTime.of(2019, 10, 17, 21, 0);

    @Test
    public void cold_meal_attendant_returns_false_when_arrival_before_9_pm_at_5_am() {
        Participant participant = new Participant(LocalDateTime.of(2019, 10, 17, 5, 0));
        Assertions.assertThat(participant.arrivedAfter(LIMIT_ARRIVAL_DATE)).isFalse();
    }

    @Test
    public void cold_meal_attendant_return_true_when_arrival_after_9_pm_at_11_pm() {
        Participant participant = new Participant(LocalDateTime.of(2019, 10, 17, 23, 0));
        Assertions.assertThat(participant.arrivedAfter(LIMIT_ARRIVAL_DATE)).isTrue();
    }

    @Test
    public void cold_meal_attendant_returns_true_when_arrival_after_9_pm_at_11_30_pm() {
        Participant participant = new Participant(LocalDateTime.of(2019, 10, 17, 23, 30));
        Assertions.assertThat(participant.arrivedAfter(LIMIT_ARRIVAL_DATE)).isTrue();
    }

    @Test
    public void cold_meal_attendant_returns_true_when_arrival_after_9_pm_at_10_pm() {
        Participant participant = new Participant(LocalDateTime.of(2019, 10, 17, 22, 0));
        Assertions.assertThat(participant.arrivedAfter(LIMIT_ARRIVAL_DATE)).isTrue();
    }
}