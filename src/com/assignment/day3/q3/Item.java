package com.assignment.day3.q3;
/*Write a program which models a library which contains many kinds of items:
Printed: Books, Journals, Magazines, and Documents
 Multimedia: CDs, and DVDs.
Every item in the library must have an ID number and title. Every printed item must have a number of pages,
and every multimedia item must have a length, in seconds. Define the classes Item, Printed and Multimedia,
making sure they have the appropriate relationships in the class hierarchy, and the appropriate private fields.
Create constructors for the three classes, using super() where necessary.
Create toString() methods for each of the three classes.
For an item, the string should have its id followed by its title.
For printed and multimedia items, the id and title should be followed by the number of pages or running length
with the appropriate unit (pages or seconds).
Sample Output:
7985 Alice in Wonderland (105 pages)
3565 In a Sentimental Mood (597 seconds)
Remember that the id and title fields in the Item class are private, so you'll need to call the toString() method
belonging to the Item class for the other two toString() methods.
 */
public class Item {

    private int id;
    private String title;

    Item(){
        super();
    }

    Item(int id,String title){
        this.id=id;
        this.title=title;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public int getId(){return this.id;}

    public String getTitle(){return this.title;}

    @Override
    public String toString(){
        return this.id+" "+this.title;
    }
}
