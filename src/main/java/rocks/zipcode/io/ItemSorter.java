package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
/*Implement Comparator interface for each class in the package src.rocks.zipcode.io.comparators.
Ensure the Comparator is parameterized with type Item

 */
public class ItemSorter {
//DECLARE array called items of type Item
    private Item[] items;
//INITIALIZE array items
    public ItemSorter(Item[] items) {
        this.items = items;
    }
//USE method sort with comparator and the array as parameters
    public Item[] sort(Comparator<Item> comparator) {
        //we sorted the array called items and we are returning items
        Arrays.sort(items, comparator);


//return the array called items
        return items;

    }



}
