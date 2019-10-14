using Library;
using NUnit.Framework;
using NFluent;
using System.Collections.Generic;
using System;

namespace Socrates.Tests
{
    [TestFixture]
    class ColdMealTests
    {
        DateTime Deadline = new DateTime(2003, 5, 1, 21, 0, 0);

        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void ListDoesNotContainColdMeal()
        {
            var checkInList = new List<CheckIn>();

            checkInList.Add(new CheckIn());
            checkInList.Add(new CheckIn());
            checkInList.Add(new CheckIn());

            var coldMealChecker = new ColdMealChecker(Deadline);
            Check.That(coldMealChecker.ColdMealNumber(checkInList)).IsEqualTo(0);
        }

    }
}
