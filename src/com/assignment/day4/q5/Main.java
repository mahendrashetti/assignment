package com.assignment.day4.q5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*An anagram is a word made by transposing the letters of another word. For example, "software" is an
anagram of "swearoft". Write a program that figures out whether one string is an anagram of another string. */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        char[] str1=s.next().toCharArray();
        char[] str2=s.next().toCharArray();



              if(str1.length==str2.length) {
                  Arrays.sort(str1);
                  Arrays.sort(str2);

                  String word1=new String(str1);
                  String word2=new String(str2);

                  if(word1.equals(word2))
                    System.out.println("given strings are anagrams");
                  else
                      System.out.println("not an anagram");
              }

              else
                  System.out.println("not an anagram");
    }
}
