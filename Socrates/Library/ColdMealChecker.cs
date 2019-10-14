using System;
using System.Collections.Generic;
using System.Text;

namespace Library
{
    public class ColdMealChecker
    {
        DateTime Deadline;

        public ColdMealChecker(DateTime deadline)
        {
            Deadline = deadline;
        }

        public int ColdMealNumber(List<CheckIn> checkIns)
        {
            int coldMeals = 0;

            foreach (var checkIn in checkIns)
            {
                if (checkIn.IsLate(Deadline) && checkIn.IsThursday())
                    coldMeals++;
            }
            return coldMeals;
        }
    }
}
