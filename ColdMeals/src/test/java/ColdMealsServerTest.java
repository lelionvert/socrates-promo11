import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColdMealsServerTest {

    @Test
    public void count_cold_meals_returns_0_when_empty_list_of_participants() {
        List<Participant> participantList = Collections.emptyList();
        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(0);
    }

    @Test
    public void count_cold_meals_returns_1_when_1_participant_arrives_at_10_pm() {
        List<Participant> participantSingleton = Collections.singletonList(
                new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        Assertions.assertThat(ColdMealsServer.countColdMeals(participantSingleton)).isEqualTo(1);
    }

    @Test
    public void count_cold_meals_returns_2_when_1_participant_arrives_at_10_pm_and_1_at_11_pm() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 23, 0)));
        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(2);
    }

    @Test
    public void count_cold_meals_returns_2_when_2_participants_arrive_at_10_pm_and_1_arrives_at_8_pm() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(2);
    }

    @Test
    public void count_cold_meals_returns_3_when_3_participants_arrive_at_10_pm() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));

        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(3);
    }

    @Test
    public void count_cold_meals_returns_3_when_3_participants_arrive_at_10_pm_and_1_arrives_at_8_pm() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(3);
    }

    @Test
    public void count_cold_meals_returns_3_when_1_participant_arrives_at_10_pm_and_2_arrive_at_8_pm() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 20, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(1);
    }

    @Test
    public void error_message_returns_error_when_1_participant_with_no_check_in_date_time() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(null));

        Assertions.assertThat(ColdMealsServer.errorMessage(participantList)).isEqualTo("Be careful Attendant without date !");
    }


    @Test
    public void count_cold_meals_returns_2_when_2_participants_arrive_at_10_pm_and_1_arrives_at_8_pm_at_second_element() {
        List<Participant> participantList = new ArrayList<>();
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 20, 0)));
        participantList.add(new Participant(LocalDateTime.of(2019, 10, 17, 22, 0)));

        Assertions.assertThat(ColdMealsServer.countColdMeals(participantList)).isEqualTo(2);
    }
}
