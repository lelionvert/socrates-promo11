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
        public void VictoriaRegisterForTriple()
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
    }
}
