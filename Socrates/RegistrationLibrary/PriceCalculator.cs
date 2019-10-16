﻿using System;
using System.Collections.Generic;
using System.Text;

namespace RegistrationLibrary
{
    public class PriceCalculator
    {
        public PriceCalculator()
        {
        }

        public int TotalAmount(Reservation reservation) {
            var choiceAmount = (int)reservation.Choice;
            var remise = reservation.MissingMeals * 40;
            
            return choiceAmount - remise;
        }
    }
}
