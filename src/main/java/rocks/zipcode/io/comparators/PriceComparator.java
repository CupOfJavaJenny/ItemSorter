package rocks.zipcode.io.comparators;


import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        //comparing price of 0.0 to 1.0
        //look at test
        return o1.getPrice().compareTo(o2.getPrice());
    }
}

