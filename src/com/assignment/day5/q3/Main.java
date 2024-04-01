package com.assignment.day5.q3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        System.out.println("enter no of student");
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();

        for (int i=0;i<no;i++){
            System.out.println("enter name id and age");
            String name=s.next();
            int id=s.nextInt();
            int age=s.nextInt();
            studentList.add(new Student(name,id,age));
        }

        System.out.println("by comparable:sorted by name");
         Collections.sort(studentList);
        for (Student student:studentList)
            System.out.println(student);

        Collections.sort(studentList,Collections.reverseOrder());
        System.out.println(studentList);

        Collections.sort(studentList,new ComparatorImp());
        System.out.println(studentList);

    }

}
