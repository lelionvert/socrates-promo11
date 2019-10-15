using NFluent;
using NUnit.Framework;
using RegistrationLibrary;
using System;
using System.Collections.Generic;
using System.Text;

namespace Socrates.Tests.RegistrationLibraryTests
{
    [TestFixture]
    class PriceCalculatorTests
    {
        [Test]
        public void PriceCalculatorReturnsSingleRoomReservationTotalAmount()
        {
            var priceCalculator = new PriceCalculator();
            var reservation = new Reservation(Choice.Single);

            Check.That(priceCalculator.TotalAmount(reservation)).IsEqualTo(610);
        }
    }
}
