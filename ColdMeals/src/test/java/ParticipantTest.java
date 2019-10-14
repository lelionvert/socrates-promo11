import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class ParticipantTest {
    @Test
    public void arrived_after_should_returns_false_when_participant_arrives_before_limit_date() {
        Participant participant = new Participant(LocalDateTime.of(2019, 10, 17, 5, 0));
        Assertions.assertThat(participant.arrivedAfter(ColdMealsServer.LIMIT_ARRIVAL_DATE)).isFalse();
    }

    @Test
    public void arrived_after_should_returns_true_when_participant_arrives_after_limit_date() {
        Participant participant = new Participant(LocalDateTime.of(2019, 10, 17, 23, 0));
        Assertions.assertThat(participant.arrivedAfter(ColdMealsServer.LIMIT_ARRIVAL_DATE)).isTrue();
    }
}