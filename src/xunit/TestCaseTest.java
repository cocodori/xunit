package xunit;

public class TestCaseTest extends TestCase{
    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        WasRun wasRun = new WasRun("testMethod");
        Assert.assertEquals(false, wasRun.wasRun); //기대값, 실제값
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasRun); //기대값, 실제값
    }

    public void testSetUp() {
        WasRun wasRun = new WasRun("testMethod");
        Assert.assertEquals(false, wasRun.wasSetUp);
        wasRun.run();
        Assert.assertEquals(true, wasRun.wasSetUp);
    }
}
