import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColdMealsServerTest {

    @Test
    public void count_cold_meals_returns_0_when_empty_list_of_participants() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));
        List<CheckedInParticipant> checkedInParticipantList = Collections.emptyList();
        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(0);
    }

    @Test
    public void count_cold_meals_returns_1_when_1_participant_arrives_after_9_pm() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));
        List<CheckedInParticipant> checkedInParticipantSingleton = Collections.singletonList(
                new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantSingleton)).isEqualTo(1);
    }

    @Test
    public void count_cold_meals_returns_2_when_2_participants_arrive_after_9_pm() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));
        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 23, 0)));
        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(2);
    }

    @Test
    public void count_cold_meals_returns_3_when_3_participants_arrive_after_9_pm() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));
        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(3);
    }

    @Test
    public void count_cold_meals_returns_2_when_2_participants_arrive_at_after_9_pm_and_the_last_one_before_9_pm() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));
        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(2);
    }

    @Test
    public void count_cold_meals_returns_3_when_3_participants_arrive_after_9_pm_and_1_arrives_before() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));

        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(3);
    }

    @Test
    public void count_cold_meals_returns_2_when_2_participants_arrive_before_9_pm_and_1_arrives_before_at_second_element() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));

        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(2);
    }

    @Test
    public void count_cold_meals_returns_1_when_1_participant_arrives_after_9_pm_and_2_arrive_before() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));

        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(1);
    }

    @Test
    public void error_message_returns_error_when_1_participant_with_no_check_in_date_time() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));

        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(null));

        Assertions.assertThat(coldMealsServer.errorMessage(checkedInParticipantList)).isEqualTo("Be careful Attendant without date !");
    }


    @Test
    public void count_cold_meals_returns_0_when_1_participant_arrives_next_day_after_2_am_and_2_arrive_before() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));

        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 18, 4, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(0);
    }


    @Test
    public void count_cold_meals_returns_2_when_1_participant_arrives_next_day_after_2_am_and_1_arrives_thursday_after_9_pm_and_1_arrives_before() {
        ColdMealsServer coldMealsServer = new ColdMealsServer(LocalDateTime.of(2019,10,17,21,0));

        List<CheckedInParticipant> checkedInParticipantList = new ArrayList<>();
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 18, 4, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 22, 0)));
        checkedInParticipantList.add(new CheckedInParticipant(LocalDateTime.of(2019, 10, 17, 20, 0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipantList)).isEqualTo(1);
    }

    @Test
    public void count_cold_meals_returns_1_for_late_participant_for_given_parameterized_limit_date() {
        LocalDateTime limitDate = LocalDateTime.of(2020,10,22,21,0);
        ColdMealsServer coldMealsServer = new ColdMealsServer(limitDate);

        List<CheckedInParticipant> checkedInParticipants = new ArrayList<>();
        checkedInParticipants.add(new CheckedInParticipant(LocalDateTime.of(2020,10,22,23,0)));
        checkedInParticipants.add(new CheckedInParticipant(LocalDateTime.of(2020,10,22,20,0)));

        Assertions.assertThat(coldMealsServer.countColdMealsParameterized(checkedInParticipants)).isEqualTo(1);
    }
}
