using System;

namespace RegistrationLibrary
{
    public class Reservation
    {
        private Choice choice;
        private CheckTime checkin;
        private CheckTime checkout;
        public int MissingMeals
        {
            get;
            private set;
        }

        public Reservation(Choice choice)
        {
            this.choice = choice;
        }

        public Reservation(Choice choice, int missingMeals) : this(choice)
        {
            this.MissingMeals = missingMeals;
        }

        public Reservation(Choice choice, CheckTime checkin, CheckTime checkout)
        {
            this.choice = choice;
            this.checkin = checkin;
            this.checkout = checkout;
        }

        public Reservation(Choice choice, CheckTime checkin, CheckTime checkout, int missingMeals) : this(choice, checkin, checkout)
        {
            this.MissingMeals = missingMeals;
        }

        public int ChoiceAmount { get { return (int)choice; } }
    }
}
