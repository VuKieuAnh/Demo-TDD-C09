import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1-1-2018")
    void caseDay1Month1Year2018() {
        NextDayCalculator calculator = new NextDayCalculator();
//        3A
//        A: Arrange: chuan bi du lieu (dau vao va dau ra)
        int day=1;
        int month=1;
        int year=2018;
        String result = "2-1-2018";
//        A: Action: thuc thi phuong thuc
        String res = calculator.getNextDay(day, month, year);
//        A: assert: so sanh ket qua ky vong voi ket qua thuc te
        assertEquals(result, res);
    }
    @Test
    @DisplayName("case 31-1-2018")
    void caseDay31Month1Year2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        int day=31;
        int month=1;
        int year=2018;
        String result = "1-2-2018";
        String res = calculator.getNextDay(day, month, year);
        assertEquals(result, res);
    }
    @Test
    @DisplayName("case 30-4-2018")
    void caseDay30Month4Year2018() {
        NextDayCalculator calculator = new NextDayCalculator();
        int day=30;
        int month=4;
        int year=2018;
        String result = "1-5-2018";
        String res = calculator.getNextDay(day, month, year);
        assertEquals(result, res);
    }

}