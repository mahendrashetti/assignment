package com.assignment.day5.q1;

import java.util.*;

public class Main {
    /*Write a method:
public static int[] append(String[] a, String[] b)
that appends one array(of Strings) to another. For example, if
a = {qqq, www, eee} and b = {aaa, sss, ddd}
result = {qqq, www, eee, aaa, sss, ddd}
Hint: Use java.util.Arrays
Write a program that takes an array of words and does the following:
● Prints out any duplicate words
● Prints the number of distinct words
● Prints the list of the words with duplicates eliminated.
Sample Input Sample Output
i came i saw i conquered Duplicate words: i
Distinct words: 4
List of the distinct words: [saw, came, conquered, i]
*/
    public static void main(String[] args) {
        String[] a = {"qqq", "www", "eee"};
        String[] b = {"aaa", "sss", "ddd"};

        System.out.println("result: "+Arrays.toString(append(a,b)));


        String inp="i came i saw i conquered";
        String[] str=inp.split(" ");
        Set<String>[] frequency=frequency(str);
        System.out.println("Duplicate words: "+frequency[1]);
        System.out.println("Distinct words:"+ frequency[0].size());
        System.out.println("List of distinct word: "+frequency[0]);
    }

    public static String[] append(String[] a, String[] b) {
        String[] result=Arrays.copyOf(a,a.length+b.length);
        System.arraycopy(b,0,result,a.length,b.length);
        return result;
    }

    public static Set<String>[] frequency(String[] str){
        Set<String> distinct=new HashSet<>();
        Set<String> dup=new HashSet<>();
        for (String s:str) {
            if(!distinct.add(s)){
                dup.add(s);
            }
        }
        return new Set[]{ distinct,dup};
    }

}
