using System;
using System.Collections.Generic;
using System.Text;

namespace Library
{
    public class ColdMealChecker
    {
        public DateTime Deadline { get; }

        public ColdMealChecker(DateTime deadline)
        {
            Deadline = deadline;
        }
        public ColdMealChecker(String deadline)
        {
            Deadline = DateTime.ParseExact(deadline, "yyyy-MM-dd HH\\hmm",
                System.Globalization.CultureInfo.InvariantCulture
            );
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
