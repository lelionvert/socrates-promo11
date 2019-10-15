import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class CheckedInParticipantBuilderTest {

    @Test
    void create_should_have_correct_data_when_building_checked_in_participant() {
        CheckedInParticipant expectedParticipant = new CheckedInParticipant(LocalDateTime.of(2019, 4, 21, 14, 54),
                LocalDateTime.of(2019, 4, 25, 10, 0), ChoiceAccomodation.TRIPLE);

        CheckedInParticipant resultCheckedInParticipant = CheckedInParticipantBuilder.create("2019-04-21 14h54",
                "2019-04-25 10h00", ChoiceAccomodation.TRIPLE);

        assertThat(resultCheckedInParticipant).isEqualTo(expectedParticipant);

    }
}