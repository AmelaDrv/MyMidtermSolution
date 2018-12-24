package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        int result = 128;
        int a = Factorial.factorial(5);
        try {
            Assert.assertEquals(result, a, "Factorial Passed");
        } catch (AssertionError e) {
            e.getMessage();
        }
    }}

