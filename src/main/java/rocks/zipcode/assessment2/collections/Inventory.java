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

private HashMap<String,Integer> inv = new HashMap<>();
private List<String> myList;

    public Inventory(List<String> strings) {

        for(String s : strings) {
            if(s != null){
                if(inv.containsKey(s)) {
                    Integer curVal = inv.get(s);
                    inv.replace(s,curVal+1);
                }

                else{
                    inv.put(s,1);
                }
            }

        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        myList = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(item != null) {
           if(inv.containsKey(item)) {
               Integer curVal = inv.get(item);
               inv.replace(item,curVal+1);
           }
           else{
               inv.put(item,1);
           }
        }

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        if(item != null) {
            if(inv.containsKey(item)) {
                Integer curVal = inv.get(item);
                inv.replace(item,curVal-1);
            }

        }

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return inv.get(item);
    }


}
