import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testSomething() {
        int variable1 = 5;
        int variable2 = 3;
        int actualSum = variable1 + variable2;
        int expectedSum = 8;

        Assert.assertEquals(actualSum, expectedSum);
    }
    @Test
    public void testSomethingAgain() {
        String actualText = "Siandien yra pirmadienis";
//        String expectedText = "antradienis";
        String expectedText = "pirmadienis";

        Assert.assertTrue(
                actualText.contains(expectedText),
                String.format("Expected: %s, actual: %s ", expectedText, actualText)
        );
    }
}
