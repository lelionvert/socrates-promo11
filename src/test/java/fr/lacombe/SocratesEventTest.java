package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SocratesEventTest {

    @Test
    public void list_participants_is_empty() {
        // Given
        SocratesEvent theSocratesEvent = new SocratesEvent(new ArrayList<CheckIn>());

        // When / Then
        Assertions.assertThat(theSocratesEvent.countParticipants()).isEqualTo(0);
    }

    @Test
    public void list_participants_is_not_empty() {
        // Given
        List<CheckIn> listCheckIns = new ArrayList<CheckIn>();
        listCheckIns.add(new CheckIn("2019-10-17 20:00"));
        listCheckIns.add(new CheckIn("2019-10-17 21:00"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listCheckIns);

        // When / Then
        Assertions.assertThat(theSocratesEvent.countParticipants()).isEqualTo(2);
    }

    @Test
    public void number_cold_meal_is_zero() {
        // Given
        List<CheckIn> listCheckIns = new ArrayList<CheckIn>();
        listCheckIns.add(new CheckIn("2019-10-17 20:00"));
        listCheckIns.add(new CheckIn("2019-10-17 21:00"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listCheckIns);

        // When / Then
        Assertions.assertThat(theSocratesEvent.countColdMeals()).isEqualTo(0);
    }

    @Test
    public void number_cold_meal_is_not_zero() {
        // Given
        List<CheckIn> listCheckIns = new ArrayList<CheckIn>();
        listCheckIns.add(new CheckIn("2019-10-17 20:00"));
        listCheckIns.add(new CheckIn("2019-10-17 21:01"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listCheckIns);

        // When / Then
        Assertions.assertThat(theSocratesEvent.countColdMeals()).isEqualTo(1);
    }

    @Test
    public void new_date_cold_meal() {
        // Given
        List<CheckIn> listCheckIns = new ArrayList<CheckIn>();
        listCheckIns.add(new CheckIn("2020-10-22 20:00"));
        listCheckIns.add(new CheckIn("2020-10-22 21:01"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listCheckIns, new ColdMealChecker("2020-10-22 21:01", "2020-10-23 01:59"));

        // When / Then
        Assertions.assertThat(theSocratesEvent.countColdMeals()).isEqualTo(1);
    }

    @Test
    public void new_date_cold_meal_bis() {
        // Given
        List<CheckIn> listCheckIns = new ArrayList<CheckIn>();
        listCheckIns.add(new CheckIn("2021-10-22 20:00"));
        listCheckIns.add(new CheckIn("2021-10-22 21:00"));

        SocratesEvent theSocratesEvent = new SocratesEvent(listCheckIns, new ColdMealChecker("2021-10-22 21:01", "2021-10-23 01:59"));

        // When / Then
        Assertions.assertThat(theSocratesEvent.countColdMeals()).isEqualTo(0);
    }



}
