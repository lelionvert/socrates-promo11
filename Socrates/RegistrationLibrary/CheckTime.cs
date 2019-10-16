using System;
using System.Collections.Generic;
using System.Text;

namespace RegistrationLibrary
{
    public class CheckTime
    {
        private DayOfWeek dayOfWeek;
        private string time;
        private int hour;
        private int min;
        private string date;
        private DayOfWeek friday;

        public CheckTime(DayOfWeek dayOfWeek, string time)
        {
            this.dayOfWeek = dayOfWeek;
            this.time = time;
        }

        public CheckTime(DayOfWeek dayOfWeek, int hour, int min)
        {
            this.dayOfWeek = dayOfWeek;
            this.hour = hour;
            this.min = min;
        }

        public CheckTime(string date, DayOfWeek friday, int hour, int min)
        {
            this.date = date;
            this.friday = friday;
            this.hour = hour;
            this.min = min;
        }
    }
}
