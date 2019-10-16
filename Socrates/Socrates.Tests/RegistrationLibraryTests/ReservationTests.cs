using NFluent;
using NUnit.Framework;
using RegistrationLibrary;
using System;
using System.Collections.Generic;
using System.Text;

namespace Socrates.Tests.RegistrationLibraryTests
{
    [TestFixture]
    class ReservationTests
    {
        /*
         *
         * Choices Price
         *
         */

        [Test]
        public void SingleChoicePrice()
        {
            var reservation = new Reservation(Choice.Single);

            Check.That((int)reservation.Choice).IsEqualTo(610);
        }

        [Test]
        public void TwinChoicePrice()
        {
            var reservation = new Reservation(Choice.Twin);

            Check.That((int)reservation.Choice).IsEqualTo(510);
        }

        [Test]
        public void TripleChoicePrice()
        {
            var reservation = new Reservation(Choice.Triple);

            Check.That((int)reservation.Choice).IsEqualTo(410);
        }

        [Test]
        public void NoAccommodationChoicePrice()
        {
            var reservation = new Reservation(Choice.NoAccommodation);

            Check.That((int)reservation.Choice).IsEqualTo(240);
        }

        /*
         *
         * Missing Meals
         *
         */

        [Test]
        public void VictoriaReservationMissingNoMealAccordingToChecks()
        {
            //Given / When
            var reservation = new Reservation(
                        choice: Choice.Triple,
                        checkin: new CheckTime(
                            DayOfWeek.Thursday,
                            hour: 21,
                            min: 0
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            hour: 15,
                            min: 0
            ));
            //Then
            Check.That(reservation.MissingMeals).IsEqualTo(0);
        }

        [Test]
        public void JeanPierreReservationMissingNoMealAccordingToChecks()
        {
            //Given / When
            var reservation = new Reservation(
                        choice: Choice.NoAccommodation,
                        checkin: new CheckTime(
                            DayOfWeek.Thursday,
                            "18:00"
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            "14:00"
            ));
            //Then
            Check.That(reservation.MissingMeals).IsEqualTo(0);
        }

        [Test]
        public void SarahReservationMissingNoMealAccordingToChecks()
        {
            //Given / When
            var reservation = new Reservation(
                        choice: Choice.NoAccommodation,
                        checkin: new CheckTime(
                            DayOfWeek.Thursday,
                            "22:00"
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            "14:30"
            ));
            //Then
            Check.That(reservation.MissingMeals).IsEqualTo(0);
        }

        [Test]
        [Ignore("Work In Progress")]
        public void MichelReservationMissing_1_MealAccordingToChecks()
        {
            //Given / When
            var reservation = new Reservation(
                        choice: Choice.Twin,
                        checkin: new CheckTime(
                            DayOfWeek.Friday,
                            "08:00"
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            "14:30"
            ));
            //Then
            Check.That(reservation.MissingMeals).IsEqualTo(1);
        }
    }
}
