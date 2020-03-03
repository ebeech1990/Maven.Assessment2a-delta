package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */


private List<String> inv;

    public Inventory(List<String> strings) {
        inv = new ArrayList<>();
        inv.addAll(strings);
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inv = new ArrayList<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        inv.add(item);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        inv.remove(item);

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer count = 0;
        for(String s : inv) {
            if(s.equals(item)){
                count++;
            }
        }
        return count;
    }



        }


