package junitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmeticTest {
    private int num1;
    private int num2;
    private int expectedResult;

    public ArithmeticTest(int num1, int num2, int expectedResult) {
        this.num1 = num1;
        this.num2 = num2;
        this.expectedResult = expectedResult;
    }

    private int sum(int a, int b) {
    	return a + b;
    }
    
    @Parameterized.Parameters
    public static Object[][] Collectioninput() {
        return new Object[][] {
            {1, 2, 3},
            {11, 12, 23},
            {10, 1, 11}
        };
    }

    @Test
    public void test() {
        assertEquals(expectedResult, sum(num1, num2));
    }

}
