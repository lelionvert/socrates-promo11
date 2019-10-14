using NUnit.Framework;
using NFluent;
using Library;

namespace Socrates.Tests
{
    [TestFixture]
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void CheckInExists()
        {
            var checkin = new CheckIn();

            Assert.Pass();
        }

        [Test]
        public void CheckInHourBefore_9_PM()
        {
            var checkin = new CheckIn();

            Check.That(checkin.time.Hour)
                .IsBefore(21);
        }
    }
}