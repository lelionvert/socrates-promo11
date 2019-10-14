using System;

namespace Library
{
    public class CheckIn
    {
        public DateTime Time { get; set; }

        public CheckIn()
        {
        }

        public CheckIn(DateTime time)
        {
            Time = time;
        }

        public bool IsLate()
        {
            return Time.Hour >= 21 && (Time.Minute > 0 || Time.Second > 0);
        }

        public bool IsThursday()
        {
            return Time.DayOfWeek == System.DayOfWeek.Thursday;
        }
    }
}
