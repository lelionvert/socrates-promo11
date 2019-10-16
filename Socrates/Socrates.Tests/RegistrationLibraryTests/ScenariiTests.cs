using NFluent;
using NUnit.Framework;
using RegistrationLibrary;
using System;
using System.Collections.Generic;
using System.Text;

namespace Socrates.Tests.RegistrationLibraryTests
{
    [TestFixture]
    class ScenariiTests
    {
        [Test]
        public void VictoriaRegistersForTripleChoice()
        {
            //Given / Then
            var reservation = new Reservation(
                        choice: Choice.Triple,
                        checkin: new CheckTime(
                            DayOfWeek.Thursday,
                            "21:00"
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            "15:00"
                        ));
            //Then
            Check.That(PriceCalculator.TotalAmount(reservation) == 410);
        }

        [Test]
        public void JeanPierreRegistersForNoAccommodationChoice()
        {
            //Given / Then
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
            Check.That(PriceCalculator.TotalAmount(reservation) == 240);
        }

        [Test]
        public void SarahRegistersForTwinChoice()
        {
            //Given / Then
            var reservation = new Reservation(
                        choice: Choice.Twin,
                        checkin: new CheckTime(
                            DayOfWeek.Thursday,
                            "22:00"
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            "14:30"
                        ));
            //Then
            Check.That(PriceCalculator.TotalAmount(reservation) == 510);
        }

        [Test]
        public void MichelRegistersForTwinChoice_Missing_1_Meal()
        {
            //Given / Then
            var reservation = new Reservation(
                        choice: Choice.Twin,
                        checkin: new CheckTime(
                            DayOfWeek.Friday,
                            "8:00"
                        ),
                        checkout: new CheckTime(
                            DayOfWeek.Sunday,
                            "14:30"
                        ),
                        missingMeals: 1);
            //Then
            Check.That(PriceCalculator.TotalAmount(reservation) == 470);
        }
    }
}
