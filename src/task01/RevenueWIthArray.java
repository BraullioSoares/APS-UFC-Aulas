package task01;

import java.io.IOException;
import java.util.ArrayList;

public class RevenueWIthArray {

    private ArrayList<Product> products;
    private int index;

    RevenueWIthArray(int numberOfProducts) {
        for (int i = 0; i < numberOfProducts; i++) {
            Product product = new Product(i, "Some description", 200.00, 100.00, 10.00 );
            products.add(product);
        }
    }

    public void insertProduct(Product product) {
        this.products.add(product);
    }

    public void buy(int code, int qtd) {
        for (Product prod: products) {
            if (prod.getCode() == code) {
                prod.buy(qtd);
            } else {
                System.out.println("ERROR - Product Not Found");
            }
        }
    }

    public void sale(int code, int qtd) {
        for (Product prod: products) {
            if (prod.getCode() == code) {
                prod.sale(qtd);
            } else {
                System.out.println("ERROR - Product Not Found");
            }
        }
    }

    public void queryPurchasePrice(int code) {
        for (Product prod: products) {
            if (prod.getCode() == code) {
                prod.getPurchaseValue();
            } else {
                System.out.println("ERROR - Product Not Found");
            }
        }
    }

    public void listPrices() {
        for (Product prod: products) {
            System.out.println("Code? " + prod.getCode());
            System.out.println("Description:" + prod.getDescription());
            System.out.println("Purchase Value: " + prod.getPurchaseValue());
        }
    }
}
