package fr.lacombe;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ScenariosTest
{

    @Test
    public void scenario_complete_price_victoria_arrives_thursday_and_leaves_sunday()
    {
        CheckIn victoriaCheckIn = new CheckIn("2019-10-17 21:00");
        CheckOut victoriaCheckOut = new CheckOut("2019-10-20 15:00");
        Participant victoria = new Participant("Victoria", victoriaCheckIn, victoriaCheckOut, Choice.TRIPLE);

        assertThat((new CalculatorPrice().calculatePrice(victoria.getChoice()))).isEqualTo(410);
    }


}
