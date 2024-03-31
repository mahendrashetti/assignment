package com.assignment.day2.q9;

/*Complete the following code snippet by adding a continue statement(with label) and a break
statement(with label) in appropriate places. Finally, the below code should search for a substring in a given
string. Here the given string is Look for a substring in me, substring to be searched is sub and the
label-name is test.*/

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;
        int max = searchMe.length() - substring.length();
        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }

            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
