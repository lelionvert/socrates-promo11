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
        public void VictoriaRegistersForTriple()
        {
            var checkIn = new CheckTime(
                DayOfWeek.Thursday,
                "21:00"
            );
            var checkOut = new CheckTime(
                DayOfWeek.Sunday,
                "15:00"
            );
            
            Check.That(
                new Reservation(Choice.Triple, checkIn, checkOut)
                .TotalAmount
                )
            .IsEqualTo(410);
        }

        [Test]
        public void JeanPierreRegistersForNoAccommodation()
        {
            var checkIn = new CheckTime(
                DayOfWeek.Thursday,
                "18:00"
            );
            var checkOut = new CheckTime(
                DayOfWeek.Sunday,
                "14:00"
            );

            Check.That(
                new Reservation(Choice.NoAccommodation, checkIn, checkOut)
                .TotalAmount
                )
            .IsEqualTo(240);
        }
    }
}
