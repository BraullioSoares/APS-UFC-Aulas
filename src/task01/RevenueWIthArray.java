package task01;

import java.util.ArrayList;

public class RevenueWIthArray {

    private ArrayList<Product> products = new ArrayList<>();
    private int index;

    public RevenueWIthArray() {

    }

    public void insertProduct(Product product, int numberOfProducts) {
        for (int i = 0; i < numberOfProducts; i++) {
            this.products.add(product);
        }
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
            System.out.println("Code: " + prod.getCode());
            System.out.println("Description:" + prod.getDescription());
            System.out.println("Purchase Value: " + prod.getPurchaseValue());
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getTotalProductsNumber() {
        return this.products.toArray().length;
    }
}
