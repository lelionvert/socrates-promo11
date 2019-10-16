using System;

namespace RegistrationLibrary
{
    public class Reservation
    {
        public Choice Choice
        {
            get;
            private set;
        }
        public int MissingMeals
        {
            get;
            private set;
        }

        private CheckTime checkin;
        private CheckTime checkout;

        public Reservation(Choice choice)
        {
            this.Choice = choice;
        }

        public Reservation(Choice choice, int missingMeals) : this(choice)
        {
            this.MissingMeals = missingMeals;
        }

        public Reservation(Choice choice, CheckTime checkin, CheckTime checkout)
        {
            this.Choice = choice;
            this.checkin = checkin;
            this.checkout = checkout;
        }

        public Reservation(Choice choice, CheckTime checkin, CheckTime checkout, int missingMeals) : this(choice, checkin, checkout)
        {
            this.MissingMeals = missingMeals;
        }

        public int ChoiceAmount
        {
            get { return (int)Choice; }
        }
    }
}
