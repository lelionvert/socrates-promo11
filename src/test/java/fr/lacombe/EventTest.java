package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EventTest {

    @Test
    public void list_participants_is_empty() {
        // Given
        Event theEvent = new Event(new ArrayList<Participant>());

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void list_participants_is_not_empty() {
        // Given
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant("2019-10-17 20:00"));
        listParticipants.add(new Participant("2019-10-17 21:00"));

        Event theEvent = new Event(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(2);
    }

    @Test
    public void number_cold_meal_is_zero() {
        // Given
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant("2019-10-17 20:00"));
        listParticipants.add(new Participant("2019-10-17 21:00"));

        Event theEvent = new Event(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.countColdMeals()).isEqualTo(0);
    }

}
