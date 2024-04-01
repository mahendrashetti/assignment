package com.assignment.day5.q3;

import java.util.Comparator;

public class ComparatorImp implements Comparator<Student> {

    @Override
    public int compare(Student s1,Student s2){
        if(s1.getAge()>s2.getAge())
            return 1;
        else if(s1.getAge()<s2.getAge())
            return -1;
        else{
            return s1.getName().compareTo(s2.getName());
        }
    }
}
