using System;

namespace RegistrationLibrary
{
    public class Reservation
    {
        private Choice choice;
        private DateTime checkin;
        private DateTime checkout;

        public Reservation(Choice choice, DateTime checkin, DateTime checkout)
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
