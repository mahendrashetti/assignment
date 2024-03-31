package com.assignment.day3.q3;

public class Printed extends Item{
    private int pages;

    Printed(){
        super();
    }

    Printed(int pages){
        this.pages=pages;
    }

    Printed(int id,String title,int pages){
        super(id, title);
        this.pages=pages;
    }

    public void setPages(int pages){
        this.pages=pages;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public String toString() {
        return super.toString()+" ("+pages+" pages)";
    }
}
