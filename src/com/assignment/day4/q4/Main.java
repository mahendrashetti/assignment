package com.assignment.day4.q4;

public class Main implements CharSequence {
    String s;

    Main(String s){
        this.s=s;
    }
    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= s.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        //as string will be reversed we should access the index in reversed order
        return s.charAt(length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub =
                new StringBuilder(s.subSequence(s.length()-1-end, s.length()-1-start));
        return sub.reverse();
    }

    @Override
    public String toString(){
        String rev=new StringBuilder(this.s).reverse().toString();
        return rev;
    }

    public static void main(String[] args) {
        Main str=new Main("this is my string");

        System.out.println(str);
    }
}
