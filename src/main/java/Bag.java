/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful. 
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;


    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[0];
    }

    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    public String getColor(){
        return this.color;
    }
    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    public int getCapacity() {
        return this.capacity;
    }


    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */
    public void setColor(String color) {
        this.color = color;
    }


    /**
     * This method takes in a String representing an item in the Bag.
     * The item is added into the Bag if the number of items
     * in the bag is < the capacity of the Bag.
     * This method should return true if the item was added
     * and false otherwise.
     * @return bool statement dependent on item.
     */
    public boolean addItem(String item){
        if (this.numberOfContents < this.capacity){
            this.contents[numberOfContents] = item;
            this.numberOfContents = this.numberOfContents + 1;
            return true;
        }
        return false;
    }


    /**
     * Returns a String. The string is the last item added to this Bag
     * and the item is removed from this Bag.
     * If there are no items in this Bag, return null.
     * @return String item which is the last item added to the bag and will be removed.
     */
    public String popItem(){
        if (this.contents.length == 0){
            return null;
        } else {
            String item = this.contents[numberOfContents - 1];
            this.contents[this.numberOfContents - 1] = null;
            this.numberOfContents = this.numberOfContents - 1;
            return item;
        }
    }


    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        this.capacity = this.capacity + n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return A String description of the items in this bag.
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
