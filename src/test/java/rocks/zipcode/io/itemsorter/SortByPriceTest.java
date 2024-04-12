package rocks.zipcode.io.itemsorter;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;
/**
 * @author leon on 30/01/2019.
 */
/*Using SortByIdTest and SortByNameTest as example classes, write test at least 3 cases for
SortByPriceTest....
GIVEN
(29-31)All will have the 3 objects of items with the 3 parameters consisting of id,name&price,
(32)our array type with its name and parameters assigned Item[] itemsToSort={actual};
(33)our array type with its name and parameters assigned Item[] itemsToSort={expected};
(34)a new item sorter object with the items to sort as a parameter ..
 (34)ItemSorter itemSorter= new ItemSorter(itemsToSort);
 (35)creation of a comparator with Item type , assigning PriceComparator to it
 WHEN
 (44)we are sorting by price using method sort

 THEN
(47)comparing if what happened in the actual matches our expectation

 */
public class SortByPriceTest {
    @Test
    public void test1() {
        //given
        Item item3 = new Item(0L,"Apple", 1.0);
        Item item2 = new Item(1L, "Banana",1.5);
        Item item1 = new Item(2L, "Cherry",2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter= new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        //when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void test2() {
        // given
        Item item3 = new Item(0L, "Razor", 1.0);
        Item item2 = new Item(1L, "Sharp", 1.5);
        Item item1 = new Item(2L, "Tapestry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Item item3 = new Item(0L, "Leon", 1.0);
        Item item2 = new Item(1L, "Nhu", 1.5);
        Item item1 = new Item(2L, "Wilhem", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
