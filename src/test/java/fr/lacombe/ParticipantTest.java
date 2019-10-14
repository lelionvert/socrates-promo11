package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ParticipantTest {

    @Test
    public void cold_meal_for_participant_arriving_late() {
        // Given
        Participant participant = new Participant("2019-10-17 22:00");

        // When / Then
        Assertions.assertThat(participant.checkColdMeal()).isTrue();
    }

    @Test
    public void not_cold_meal_for_participant_arriving_early() {
        // Given
        Participant participant = new Participant("2019-10-17 21:00");

        // When / Then
        Assertions.assertThat(participant.checkColdMeal()).isFalse();
    }

    @Test
    public void no_meal_for_participant_arriving_too_late() {
        // Given
        Participant participant = new Participant("2019-10-18 02:00");

        // When / Then
        Assertions.assertThat(participant.checkColdMeal()).isFalse();
    }
}
