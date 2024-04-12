package rocks.zipcode.io.comparators;

/**
 * @author leon on 30/01/2019.
 */

import rocks.zipcode.io.Item;


import java.util.Comparator;



public class IdComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        //I called the getter calling the type .compare method(we're comparing 2 ids that are longs)
        //we are taking ids from the items
       return Long.compare(o1.getId(),o2.getId());

    }
}
