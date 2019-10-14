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

            Check.That(checkin.IsLate()).IsEqualTo(false);
        }

        [Test]
        public void CheckInHourAfter_9_PM()
        {
            var time = new System.DateTime()
                .AddHours(21)
                .AddSeconds(1);
            var checkin = new CheckIn(time);

            Check.That(checkin.IsLate()).IsEqualTo(true);
        }
    }
}