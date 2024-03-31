package com.assignment.day3.q3;

public class Multimedia extends Item{
    private int seconds;

    Multimedia(){
        super();
    }

    Multimedia(int seconds){
        this.seconds=seconds;
    }

    Multimedia(int id,String title,int seconds){
        super(id, title);
        this.seconds=seconds;
    }

    public void setSeconds(int seconds){
        this.seconds=seconds;
    }

    public int getSeconds(){
        return seconds;
    }

    @Override
    public String toString() {
        return super.toString()+" ("+seconds+" seconds)";
    }
}
