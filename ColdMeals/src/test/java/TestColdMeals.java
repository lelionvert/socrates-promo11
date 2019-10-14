import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDateTime;

public class TestColdMeals {

    @Test
    public void cold_meal_individual_returns_true_when_arrival_before_9_pm(){
        Attendant attendant = new Attendant(LocalDateTime.of(2019,10,17,5,0));
        Assertions.assertThat(attendant.getColdMeal()).isTrue();
    }

    private class Attendant {
        public Attendant(LocalDateTime arrivalDateTime) {

        }

        public boolean getColdMeal() {
            return true;
        }
    }
}
