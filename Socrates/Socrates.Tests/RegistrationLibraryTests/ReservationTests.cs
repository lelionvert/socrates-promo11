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

        [Test]
        public void TwinRoomPrice()
        {
            var reservation = new Reservation(Choice.Twin);

            Check.That(reservation.TotalAmount).IsEqualTo(510);
        }

        [Test]
        public void TripleRoomPrice()
        {
            var reservation = new Reservation(Choice.Triple);

            Check.That(reservation.TotalAmount).IsEqualTo(410);
        }
    }
}
