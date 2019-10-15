using NFluent;
using NUnit.Framework;
using RegistrationLibrary;
using System;
using System.Collections.Generic;
using System.Text;

namespace Socrates.Tests.RegistrationLibraryTests
{
    [TestFixture]
    class RegistrationTests
    {

        [Test]
        public void VictoriaRegisterForTriple()
        {
            var checkin = new DateTime(2019, 10, 17, 21, 0, 0);
            var checkout = new DateTime(2019, 10, 20, 15, 0, 0);
            var reservation = new Reservation(Choice.Triple, checkin, checkout);

            Check.That(reservation.TotalAmount).IsEqualTo(410);
        }
    }

}
