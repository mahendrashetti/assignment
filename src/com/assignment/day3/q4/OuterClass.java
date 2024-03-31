package com.assignment.day3.q4;

public class OuterClass {
    private int outerX = 10;

    public void printOuterX() {
        System.out.println("outerX :" + outerX + " in OuterClass");
    }

    public void sayHello() {
        //local inner class
        class LocalInnerClass {
            public void greetInLocal() {
                System.out.println("Hello World in LocalInnerClass!!");
            }

            public void printXInLocal() {
                System.out.println("outerX :" + outerX + " in LocalInnerClass");
            }
        }

        //implementing anonymous class
        AnonymousInnerClass hello = new AnonymousInnerClass() {
            public void printHelloWorld() {
                System.out.println("Hello World in sayHello!!");
                System.out.println("outerX :" + outerX + " in AnonymousInnerClass");
            }

        };

        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.greetInLocal();
        localInnerClass.printXInLocal();
        hello.printHelloWorld();

    }

}


interface AnonymousInnerClass{
    public void printHelloWorld();
}