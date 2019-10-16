package fr.lacombe;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorPriceTest {

    @Test
    public void choice_triple_price_is_410() {
        Assertions.assertThat(new CalculatorPrice().calculatePrice(Choice.TRIPLE)).isEqualTo(410);
    }

    @Test
    public void choice_single_price_is_610() {
        Assertions.assertThat(new CalculatorPrice().calculatePrice(Choice.SINGLE)).isEqualTo(610);
    }
}
