package string.problems;
import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        boolean result = true;
        String b = "yes";
        String c = "sey";
        Anagram n = new Anagram();
        try {
            boolean a = n.isAnagram(b, c);
            Assert.assertEquals(result, a, "Test passed");
        } catch (Exception e) {
            e.getMessage();
        }
    }

}

