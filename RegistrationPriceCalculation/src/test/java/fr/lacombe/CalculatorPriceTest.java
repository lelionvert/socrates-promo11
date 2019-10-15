package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorPriceTest {

    @Test
    public void calculate_price_of_a_choice() {
        Assertions.assertThat(new CalculatorPrice().calculatePrice(Choice.TRIPLE)).isEqualTo(410);
    }
}
