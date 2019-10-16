﻿using NFluent;
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
        public void SingleRoomPrice()
        {
            Check.That(
                new PriceCalculator().TotalAmount(
                    new Reservation(Choice.Single)
                    )
                ).IsEqualTo(610);
        }

        [Test]
        public void TwinRoomPrice()
        {
            Check.That(
                new PriceCalculator().TotalAmount(
                    new Reservation(Choice.Twin)
                    )
                ).IsEqualTo(510);
        }

        [Test]
        public void TripleRoomPrice()
        {
            Check.That(
                new PriceCalculator().TotalAmount(
                    new Reservation(Choice.Triple)
                    )
                ).IsEqualTo(410);
        }

        [Test]
        public void NoAccommodationPrice()
        {
            Check.That(
                new PriceCalculator().TotalAmount(
                    new Reservation(Choice.NoAccommodation)
                    )
                ).IsEqualTo(240);
        }

        [Test]
        public void PriceCalculatorReturnsSingleReservationTotalAmount()
        {
            var priceCalculator = new PriceCalculator();
            var reservation = new Reservation(Choice.Single);

            Check.That(priceCalculator.TotalAmount(reservation)).IsEqualTo(610);
        }

        [Test]
        public void PriceCalculatorReturnsTwinReservationTotalAmount()
        {
            var priceCalculator = new PriceCalculator();
            var reservation = new Reservation(Choice.Twin);

            Check.That(priceCalculator.TotalAmount(reservation)).IsEqualTo(510);
        }

        [Test]
        public void PriceCalculatorReturnsNoAccommodationReservationTotalAmount()
        {
            var priceCalculator = new PriceCalculator();
            var reservation = new Reservation(Choice.NoAccommodation);

            Check.That(priceCalculator.TotalAmount(reservation)).IsEqualTo(240);
        }

        [Test]
        public void PriceCalculatorReturnsTwin_1_MissingMeal_ReservationTotalAmount()
        {
            var priceCalculator = new PriceCalculator();
            var reservation = new Reservation(Choice.Twin, 1);

            Check.That(priceCalculator.TotalAmount(reservation)).IsEqualTo(470);
        }
    }
}
