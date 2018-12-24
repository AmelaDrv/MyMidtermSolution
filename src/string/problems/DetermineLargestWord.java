package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        String wordNLength = findTheLargestWord(s);
        System.out.println(wordNLength);
        //implement


    }

    public static String findTheLargestWord(String wordGiven){
        //Map<Integer, String> map = new HashMap<Integer, String>();

        String[] strSplit = wordGiven.split(" ");
        int longestWord = 0;
        String longesWordString = null;
        for(var i = 0; i < strSplit.length; i++){
            if(strSplit[i].length() > longestWord){
                longestWord = strSplit[i].length();
                longesWordString = strSplit[i];
            }
        }
        return Integer.toString(longestWord) + " " + longesWordString;
    }
        //String st = "";
        //implement

       // return map;

}
