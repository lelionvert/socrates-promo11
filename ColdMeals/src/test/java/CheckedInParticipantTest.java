import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class CheckedInParticipantTest {
    private static final LocalDateTime LIMIT_ARRIVAL_DATE = LocalDateTime.of(2019, 10, 17, 21, 0);
    @Test
    public void arrived_after_should_returns_false_when_participant_arrives_before_limit_date() {
        CheckedInParticipant checkedInParticipant = new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 5, 0));
        Assertions.assertThat(checkedInParticipant.checkedInAfter(LIMIT_ARRIVAL_DATE)).isFalse();
    }

    @Test
    public void arrived_after_should_returns_true_when_participant_arrives_after_limit_date() {
        CheckedInParticipant checkedInParticipant = new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 23, 0));
        Assertions.assertThat(checkedInParticipant.checkedInAfter(LIMIT_ARRIVAL_DATE)).isTrue();
    }

    @Test
    public void build_correct_checked_in_participant_when_string_given_in_parameter() {
        CheckedInParticipant checkedInParticipant = new CheckedInParticipant("2019-10-17 21h05");
        Assertions.assertThat(checkedInParticipant.getCheckInDateTime()).isEqualTo(LocalDateTime.of(2019,10,17,21,5));
    }
}