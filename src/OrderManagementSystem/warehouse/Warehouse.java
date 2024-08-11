package OrderManagementSystem.warehouse;

import OrderManagementSystem.Address;
import OrderManagementSystem.Inventory;

import java.util.Map;

public class Warehouse {
    public  Inventory inventory;
    Address address;

    //update inventory
    public void removeItemFromInventory(Map<Integer, Integer> productCategoryAndCountMap){

        //it will update the items in the inventory based upon product category.
        inventory.removeItems(productCategoryAndCountMap);
    }

    public void addItemToInventory(Map<Integer, Integer> productCategoryAndCountMap){

        //it will update the items in the inventory based upon product category.
    }

}
