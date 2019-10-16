import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChoiceAccommodationTest {
    @Test
    void checked_in_participant_has_correct_choice_when_requested() {
        CheckedInParticipant pierre = CheckedInParticipantBuilder.create("2019-10-17 21h00",
                "2019-10-17 21h00", ChoiceAccomodation.TRIPLE);

        Assertions.assertThat(pierre.getChoice()).isEqualTo(ChoiceAccomodation.TRIPLE);
    }

    @Test
    void get_price_from_accommodation_choice_TRIPLE() {
        Assertions.assertThat(ChoiceAccomodation.TRIPLE.getPrice()).isEqualTo(410);
    }

    @Test
    void get_price_for_accommodation_choice_DOUBLE() {
        Assertions.assertThat(ChoiceAccomodation.TWIN.getPrice()).isEqualTo(510);
    }
}