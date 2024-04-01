package com.assignment.day5.q4;
import java.util.*;
public class Main {
    /*Write a program that creates a list, set and map of items. The user should not be allowed to do any
modifications (add/delete) to these once they are created.
*/
    public static void main(String[] args) {

        List<String> unmodifiableList = List.of("Apple", "Banana", "Orange");

        Set<Integer> unmodifiableSet = Set.of(10, 20, 30);

        Map<String, Integer> unmodifiableMap = Map.of("One", 1, "Two", 2, "Three", 3);

        // Attempting to modify unmodifiable collections will result in UnsupportedOperationException
        try {
            unmodifiableList.add("Grapes");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        try {
            unmodifiableSet.add(40);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        try {
            unmodifiableMap.put("Four", 4);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }

        // Displaying unmodifiable collections
        System.out.println("Unmodifiable List: " + unmodifiableList);
        System.out.println("Unmodifiable Set: " + unmodifiableSet);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);
    }
}
