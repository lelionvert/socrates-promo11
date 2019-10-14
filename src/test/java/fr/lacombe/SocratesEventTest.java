package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SocratesEventTest {

    @Test
    public void list_participants_is_empty() {
        // Given
        SocratesEvent theSocratesEvent = new SocratesEvent(new ArrayList<Participant>());

        // When / Then
        Assertions.assertThat(theSocratesEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void list_participants_is_not_empty() {
        // Given
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant("2019-10-17 20:00"));
        listParticipants.add(new Participant("2019-10-17 21:00"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listParticipants);

        // When / Then
        Assertions.assertThat(theSocratesEvent.countParticipants()).isEqualTo(2);
    }

    @Test
    public void number_cold_meal_is_zero() {
        // Given
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant("2019-10-17 20:00"));
        listParticipants.add(new Participant("2019-10-17 21:00"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listParticipants);

        // When / Then
        Assertions.assertThat(theSocratesEvent.countColdMeals()).isEqualTo(0);
    }

    @Test
    public void number_cold_meal_is_not_zero() {
        // Given
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant("2019-10-17 20:00"));
        listParticipants.add(new Participant("2019-10-17 21:01"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listParticipants);

        // When / Then
        Assertions.assertThat(theSocratesEvent.countColdMeals()).isEqualTo(1);
    }

}
