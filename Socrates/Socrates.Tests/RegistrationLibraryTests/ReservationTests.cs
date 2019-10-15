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
        [Test]
        public void SingleRoomPrice()
        {
            var reservation = new Reservation(Choice.Single);

            Check.That(reservation.TotalAmount).IsEqualTo(610);
        }
    }
}
