package task01;

public class Product {
    private int code;
    private String description;
    private double purchaseValue;
    private double productCost;
    private double profit;
    private int quantity;

    public Product(int code, String description, double purchaseValue, double productCost, double profit) {
        this.code = code;
        this.description = description;
        this.purchaseValue = purchaseValue;
        this.productCost = productCost;
        this.profit = profit;
    }

    public Product(int code, String description, double purchaseValue, double productCost, double profit, int quantity) {
        this.code = code;
        this.description = description;
        this.purchaseValue = purchaseValue;
        this.productCost = productCost;
        this.profit = profit;
        this.quantity = quantity;
    }

    public void buy(int qtd) {
        quantity = quantity + qtd;
    }

    public void sale (int qtd) {
        quantity -= qtd;
    }

    public double calcSalePrice() {
        return this.purchaseValue + this.productCost + this.profit * (this.purchaseValue + this.productCost);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
