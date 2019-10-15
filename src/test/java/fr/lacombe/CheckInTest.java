package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CheckInTest {

    @Test
    public void cold_meal_for_participant_arriving_late() {
        // Given
        CheckIn checkIn = new CheckIn("2019-10-17 22:00");

        // When / Then
        Assertions.assertThat(new ColdMealChecker("2019-10-17 21:01", "2019-10-18 01:59").checkColdMeal(checkIn.getArrivalDate())).isTrue();
    }

    @Test
    public void not_cold_meal_for_participant_arriving_early() {
        // Given
        CheckIn checkIn = new CheckIn("2019-10-17 21:00");

        // When / Then
        Assertions.assertThat(new ColdMealChecker("2019-10-17 21:01", "2019-10-18 01:59").checkColdMeal(checkIn.getArrivalDate())).isFalse();
    }

    @Test
    public void no_meal_for_participant_arriving_too_late() {
        // Given
        CheckIn checkIn = new CheckIn("2019-10-18 02:00");

        // When / Then
        Assertions.assertThat(new ColdMealChecker("2019-10-17 21:01", "2019-10-18 01:59").checkColdMeal(checkIn.getArrivalDate())).isFalse();
    }
}
