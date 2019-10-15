using System;
using System.Collections.Generic;
using System.Text;

namespace RegistrationLibrary
{
    public class PriceCalculator
    {
        private Reservation reservation;

        public PriceCalculator()
        {
        }

        public int TotalAmount(Reservation reservation) {
            var choiceAmount = reservation.ChoiceAmount;

            return choiceAmount;
        }
    }
}
