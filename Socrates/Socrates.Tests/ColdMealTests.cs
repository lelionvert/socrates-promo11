using Library;
using NUnit.Framework;
using NFluent;
using System.Collections.Generic;

namespace Socrates.Tests
{
    [TestFixture]
    class ColdMealTests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void IsColdMeal()
        {
            var checkInList = new List<CheckIn>();

            checkInList.Add(new CheckIn());
            checkInList.Add(new CheckIn());
            checkInList.Add(new CheckIn());

            var coldMealChecker = new ColdMealChecker();
            Check.That(coldMealChecker.ColdMealNumber(checkInList)).IsEqualTo(0);
        }

    }
}
