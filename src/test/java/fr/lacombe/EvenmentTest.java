package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class EvenmentTest
{
    @Test
    public void list_participants_is_empty()
    {
        // Given
        Evenment theEvent = new Evenment(new ArrayList<Participant>());

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void list_participants_is_not_empty() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant(formatDate.parse("2019-10-17 20:00")));
        listParticipants.add(new Participant(formatDate.parse("2019-10-17 21:00")));

        Evenment theEvent = new Evenment(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(2);
    }

    @Test
    public void cold_meal_for_person_arriving_late() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant(formatDate.parse("2019-10-17 22:00")) );

        // When / Then
        Assertions.assertThat(listParticipants.get(0).checkColdMeal()).isTrue();
    }

    @Test
    public void not_cold_meal_for_person_arriving_early() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant(formatDate.parse("2019-10-17 21:00")) );

        // When / Then
        Assertions.assertThat(listParticipants.get(0).checkColdMeal()).isFalse();
    }

    @Test
    public void no_meal_for_person_arriving_too_late() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        List<Participant> listParticipants = new ArrayList<Participant>();
        listParticipants.add(new Participant(formatDate.parse("2019-10-18 02:00")) );

        // When / Then
        Assertions.assertThat(listParticipants.get(0).checkColdMeal()).isFalse();
    }

}
