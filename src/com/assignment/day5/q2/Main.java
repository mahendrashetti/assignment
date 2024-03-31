package com.assignment.day5.q2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    /*Write a program that gets an array of words and does the following:
        ● Prints each word and it's frequency
        ● Prints only the words
        ● Prints only the frequency of all words
        Here's a sample run assuming the array of words as {i, came, i, saw, i, conquered}
        saw : 1
        came : 1
        conquered : 1
        i : 3
        Note: Order doesn't matter in any of the above outputs
    */
    public static void main(String[] args) {
        String[] str={"i" , "came" , "i" , "saw" , "i" , "conquered"};

        HashMap<String,Integer> wordCount=new HashMap<>();

        for (String word:str) {
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }

        System.out.println(wordCount);
        System.out.println(wordCount.keySet());
        System.out.println(wordCount.values());
    }
}
