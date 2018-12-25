package parser;


import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        int a = 80;
        String b = XmlReader.convertIntToChar("B");
        try {
            Assert.assertEquals(a, b, "Factorial Passed");
        } catch (AssertionError e) {
            e.getMessage();


        }
    }
}

