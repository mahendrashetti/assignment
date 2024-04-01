package com.assignment.day5.q8;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    /*Write a program that gets an array of words and does the following:
        ● Prints each word and it's frequency
        ● Prints only the words
        ● Prints only the frequency of all words
        Here's a sample run assuming the array of words as {i , came , i , saw , i , conquered}
        came : 1
        conquered : 1
        i : 3
        saw : 1
        [came, conquered, i, saw]
        [1, 1, 3, 1]
        Note: Print in the same order as shown above
     */
    public static void main(String[] args) {
        String[] str={"i" , "came" , "i" , "saw" , "i" , "conquered"};

        TreeMap<String,Integer> wordCount=new TreeMap<>();

        for (String word:str) {
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }

        System.out.println(wordCount);
        System.out.println(wordCount.keySet());
        System.out.println(wordCount.values());
    }
}
