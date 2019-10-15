using System;
using System.Collections.Generic;
using System.Text;

namespace RegistrationLibrary
{
    public class CheckTime
    {
        private DayOfWeek dayOfWeek;
        private string time;

        public CheckTime(DayOfWeek dayOfWeek, string time)
        {
            this.dayOfWeek = dayOfWeek;
            this.time = time;
        }
    }
}
