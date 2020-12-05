package task01;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RevenueWIthArray revenueWIthArray = new RevenueWIthArray();
        Scanner userData = new Scanner(System.in);
        String desc;
        int code, quantity;
        double purchaseValue, productCost, profit;

        int option = 0;
        do {
            Scanner menuOpt = new Scanner(System.in);

            System.out.print("##--Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| 0 - List Products              \n");
            System.out.print("| 1 - Create Product \n");
            System.out.print("| 2 - Buy \n");
            System.out.print("| 3 - Sale          \n");
            System.out.print("| 4 - Show Price              \n");
            System.out.print("| 5 - List Prices              \n");
            System.out.print("| 6 - Query Purchase Value              \n");
            System.out.print("| 7 - Alter Purchase Value              \n");
            System.out.print("| 8 - Query Product Cost              \n");
            System.out.print("| 9 - Alter Product Cost              \n");
            System.out.print("|10 - Query Product Profit              \n");
            System.out.print("|11 - Alter Product Profit              \n");
            System.out.print("|12 - Exit              \n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Please type ome option: ");

            option = menuOpt.nextInt();

            switch (option) {
                case 0:
                    System.out.println(revenueWIthArray.getTotalProductsNumber());
                    for (Product prod: revenueWIthArray.getProducts()) {
                        System.out.println("Code: "+ prod.getCode());
                        System.out.println("Description: " + prod.getDescription());
                        System.out.println("Purchase Value: " + prod.getPurchaseValue());
                        System.out.println("Product Cost: "+ prod.getProductCost());
                        System.out.println("Profit: " + prod.getProfit());
                        System.out.println("Quantity: " + prod.getQuantity());
                    }
                    System.out.println("Type M to go back to the Menu options");
                    Scanner enter = new Scanner(System.in);
                    enter.next();
                    break;
                case 1:
                    System.out.println("CODE: ");
                    code = userData.nextInt();

                    System.out.println("Description: ");
                    desc = userData.next();

                    System.out.println("Purchase Value: ");
                    purchaseValue = userData.nextDouble();

                    System.out.println("Product Cost: ");
                    productCost = userData.nextDouble();

                    System.out.println("Profit");
                    profit = userData.nextDouble();

                    System.out.println("Quantity: ");
                    quantity = userData.nextInt();

                    Product product = new Product(code, desc, purchaseValue, productCost, profit, quantity);
                    revenueWIthArray.insertProduct(product, quantity);

                    break;
                case 2:
                    System.out.println("CODE: ");
                    code = userData.nextInt();

                    System.out.println("Quantity: ");
                    quantity = userData.nextInt();
                    revenueWIthArray.buy(code, quantity);
                    break;
                case 12:
                    System.out.println("Thank you.");
                    break;
            }
        } while (option != 12);
    }
}
