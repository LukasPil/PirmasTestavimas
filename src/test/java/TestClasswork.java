import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestClasswork {

    //    Testas “žalias” jeigu 995 dalijasi iš 3 (be liekanos)
//    Testas “žalias” jeigu šiandien trečiadienis
//    Testas “žalias” po to, kai “palaukia” 5 sekundes
//    Bonus: Testas “žalias” jei nuo 1 iki 10 yra 4 lyginiai skaičiai

    @Test
    public void if995DividesBy3() {

        int number = 995;
        int actualReminder = number % 3;
        int expectetNumber = 0;

        Assert.assertEquals(actualReminder, expectetNumber);


    }

    @Test
    public void ifTodayIsWednesday() {
        DayOfWeek expectedDay = DayOfWeek.WEDNESDAY;
        DayOfWeek actualDay = LocalDate.now().getDayOfWeek();

        Assert.assertTrue(actualDay == expectedDay,
                String.format("Expected: %s, Actual: %s", expectedDay, actualDay));
    }

    @Test
    public void testWaitFor5Seconds() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }



}
