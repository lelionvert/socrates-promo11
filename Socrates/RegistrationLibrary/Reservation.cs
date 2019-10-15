using System;

namespace RegistrationLibrary
{
    public class Reservation
    {
        private Choice choice;
        private CheckTime checkin;
        private CheckTime checkout;

        public Reservation(Choice choice)
        {
            this.choice = choice;
        }

        public Reservation(Choice choice, CheckTime checkin, CheckTime checkout)
        {
            this.choice = choice;
            this.checkin = checkin;
            this.checkout = checkout;
        }

        public int TotalAmount
        {
            get
            {
                return (int) choice;
            }
        }
    }
}
