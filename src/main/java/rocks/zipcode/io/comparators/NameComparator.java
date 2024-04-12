package rocks.zipcode.io.comparators;


import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {


  @Override
  public int compare(Item o1, Item o2) {
    //comparing "Apple(5) to "Banana(6)"
    //Look at test what are items we are comparing
    return o1.getName().compareTo(o2.getName());



  }
}

