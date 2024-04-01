package com.assignment.day5.q7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*Write a program that accepts an input string array/s and prompts the user to select a task from the menu
as shown below. [use the compareTo() method of the String class]
Menu
====
1. Sort array
2. Perform binary search in array
3. Check if two arrays are equal
4. Replace/fill array with a default value
*/
    public static void main(String[] args) {
        System.out.println("enter the string to be stored as array");
        Scanner s=new Scanner(System.in);
        String[] strings=s.nextLine().split(" ");

        int opt=0;

        do{
            System.out.println("1. Sort array\n" +
                    "2. Perform binary search in array\n" +
                    "3. Check if two arrays are equal\n" +
                    "4. Replace/fill array with a default value\n5 exit");
            opt=s.nextInt();
            switch (opt){
                case 1:{
                    sort(strings);
                    System.out.println(Arrays.toString(strings));
                    break;
                }

                case 2:{
                    sort(strings);
                    System.out.println("enter the word to search");
                    String word=s.next();
                    int index=binarySearch(strings,word);
                    System.out.println(index>-1?"found at index"+index:"not found");
                    break;
                }

                case 3:{s.nextLine();
                    System.out.println("enter the 2nd string to be stored as array");
                    String[] strings2=s.nextLine().split(" ");
                    System.out.println(Arrays.equals(strings,strings2)==true?"both arrays are equal":"not equal");
                    break;
                }
                case 4:{
                    System.out.println("enter the default value to be filled");
                    String def=s.next();
                    Arrays.fill(strings,def);
                    System.out.println(Arrays.toString(strings));
                    break;
                }

                case 5:return;

                default:
                    System.out.println("enter valid choice");
            }
        }while (opt!=4);

    }

    public static String[] sort(String[] strArr){
        for(int i=0;i<strArr.length-1;i++){
            for(int j=0;j<strArr.length-1-i;j++){
                if(strArr[j].compareTo(strArr[j+1])>0){
                    String temp=strArr[j];
                    strArr[j]=strArr[j+1];
                    strArr[j+1]=temp;
                }
            }
        }
        return strArr;
    }

    public static  int binarySearch(String[] strings,String str){
        int low=0,high=strings.length-1;
        int mid;
        while (high>=low){
            mid=low+(high-low)/2;

            if(strings[mid].compareTo(str)>0)
                high=mid-1;
            else if(strings[mid].compareTo(str)<0)
                low=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
