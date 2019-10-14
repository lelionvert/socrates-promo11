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
    public void number_participants_equals_0()
    {
        // Given
        Evenment theEvent = new Evenment(new ArrayList<Date>());

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void number_participants_equals_5() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("HH:mm");
        List<Date> listParticipants = new ArrayList<Date>();
        listParticipants.add(formatDate.parse("20:00"));
        listParticipants.add(formatDate.parse("21:00"));
        listParticipants.add(formatDate.parse("22:00"));
        listParticipants.add(formatDate.parse("23:00"));
        listParticipants.add(formatDate.parse("00:00"));

        Evenment theEvent = new Evenment(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.countParticipants()).isEqualTo(5);
    }

    @Test
    public void check_cold_meal_for_22h_is_true() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("HH:mm");
        List<Date> listParticipants = new ArrayList<Date>();
        listParticipants.add(formatDate.parse("20:00"));
        listParticipants.add(formatDate.parse("21:00"));
        listParticipants.add(formatDate.parse("22:00"));
        listParticipants.add(formatDate.parse("23:00"));
        listParticipants.add(formatDate.parse("00:00"));

        Evenment theEvent = new Evenment(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.checkColdMeal(listParticipants.get(2))).isTrue();
    }

    @Test
    public void check_cold_meal_for_20h_is_false() throws ParseException {
        // Given
        SimpleDateFormat formatDate = new SimpleDateFormat ("HH:mm");
        List<Date> listParticipants = new ArrayList<Date>();
        listParticipants.add(formatDate.parse("20:00"));
        listParticipants.add(formatDate.parse("21:00"));
        listParticipants.add(formatDate.parse("22:00"));
        listParticipants.add(formatDate.parse("23:00"));
        listParticipants.add(formatDate.parse("00:00"));

        Evenment theEvent = new Evenment(listParticipants);

        // When / Then
        Assertions.assertThat(theEvent.checkColdMeal(listParticipants.get(0))).isFalse();
    }

}
