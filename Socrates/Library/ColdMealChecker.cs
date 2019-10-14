using System;
using System.Collections.Generic;
using System.Text;

namespace Library
{
    public class ColdMealChecker
    {
        DateTime Deadline = new DateTime(2019, 1, 1, 21, 0, 0);

        public int ColdMealNumber(List<CheckIn> checkIns)
        {
            int coldMeals = 0;

            foreach (var checkIn in checkIns)
            {
                coldMeals += checkIn.IsLate(Deadline) ? 1 : 0;
            }
            return coldMeals;
        }
    }
}
