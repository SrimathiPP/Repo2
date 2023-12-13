package com.perscholas.java_basics;

public class CoffeeShopCashBill {
    // Write a program where you create three variables that represent products at a cafe.
    // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
    // Assign prices to each product. Create two more variables called subtotal and totalSale
    // and complete an “order” for three items of the first product, four items of the second product,
    // and two items of the third product. Add them all together to calculate the subtotal.
    // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain
    // the totalSale amount. Be sure to format the results to two decimal places.
    private final static double coffeePrice=3.19;
    private final static double cappuccinoPrice=4.25;
    private final static double espressoPrice=4.98;
    private final static double greenTeaPrice=1.99;
    double subTotalAmount;
    double totalSaleAmount;
    public  void calculateBill(int cofCount,int capCount,int espCount,int greCount) {
        subTotalAmount = cofCount * coffeePrice + capCount * cappuccinoPrice + espCount * espressoPrice + greCount * greenTeaPrice;
        totalSaleAmount =subTotalAmount+(subTotalAmount*0.11);
        System.out.println("SubTotal : "+subTotalAmount);
        System.out.println("TotalSaleAmount : "+totalSaleAmount);
    }
    public static void main(String[] args) {
        CoffeeShopCashBill csBill=new CoffeeShopCashBill();
        csBill.calculateBill(3,4,2,0);
    }
}
