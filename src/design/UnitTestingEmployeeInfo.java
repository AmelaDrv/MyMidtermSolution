package design;

import org.testng.Assert;




public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


            double result = 2500;
            try {
                double a = EmployeeInfo.calculateEmployeeBonus(10.0, 25000);
                Assert.assertEquals(result, a, "Test passed");
            } catch (Exception e) {
                e.getMessage();
            }
        }

}

