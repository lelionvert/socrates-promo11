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

            Check.That((int)reservation.Choice).IsEqualTo(610);
        }

        [Test]
        public void TwinRoomPrice()
        {
            var reservation = new Reservation(Choice.Twin);

            Check.That((int)reservation.Choice).IsEqualTo(510);
        }

        [Test]
        public void TripleRoomPrice()
        {
            var reservation = new Reservation(Choice.Triple);

            Check.That((int)reservation.Choice).IsEqualTo(410);
        }

        [Test]
        public void NoAccommodationPrice()
        {
            var reservation = new Reservation(Choice.NoAccommodation);

            Check.That((int)reservation.Choice).IsEqualTo(240);
        }
    }
}
