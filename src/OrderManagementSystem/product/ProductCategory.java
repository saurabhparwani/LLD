package OrderManagementSystem.product;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    public int productCategoryId;
    public String categoryName;
    List<Product> products = new ArrayList<>();
    public double price;


    public void addProduct(Product product){
        products.add(product);
    }

    //remove products
    public void removeProduct(int count){
        for(int i=1;i<=count;i++){
            products.remove(0);
        }
    }

}
