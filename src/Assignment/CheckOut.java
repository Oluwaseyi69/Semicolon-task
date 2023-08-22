package Assignment;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CheckOut {
    private static Scanner input = new Scanner(System.in);
    private String cashier;
    private String prices;
    private double total;
    private double subTotal;
    private static double discounted;
    private static double vat;
    private ArrayList <String> itemName  = new ArrayList<>();
    private ArrayList <Integer> quantityList  = new ArrayList<>();
    private ArrayList <Double> priceList  = new ArrayList<>();


    public static void main(String[] args) {
        CheckOut checkOut = new CheckOut(); // declared all variables
        String customerName = checkOut.customerName();
        double subtotal = checkOut.subTotal;
        double total = checkOut.total();
        System.out.println("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
                TELEPHONE NUMBER : 92345675438""");
        System.out.println("CUSTOMER NAME" + " " + customerName );
        System.out.println("=".repeat( 10 * (5)));
        System.out.println("       ITEM     QUANTITY   AMOUNT   TOTAL(NGN)");
        System.out.println("-".repeat( 10 * (5)));
        checkOut.printing();
        System.out.println("Sub Total: "+ " " + subtotal);
        System.out.println("Discount: " + " " + discounted);
        System.out.println("VAT: "+ " "+ vat);
//        checkOut.printing();

//        System.out.println("Total" + " "+total );

    }

    private double total() {
        return 0;
    }

    public String customerName(){
        System.out.println("What is the Customer's name: ");
        String name = input.next();
        items();
        return name;
    }
    public void items(){
        System.out.println("What did the user buy? ");
        String item = input.next();
        itemName.add(item);
        quantity();
    }
    public void quantity(){
        System.out.println("How many pieces?");
        double quantity = input.nextDouble();
        quantityList.add((int) quantity);
        price();

    }
    public void price(){
        System.out.println("How much per unit?");
        double price = input.nextDouble();
        priceList.add(price);

        moreItems();
    }
    public void printing(){
        for (int index = 0; index < itemName.size(); index++) {
            double total = quantityList.get(index) * priceList.get(index);
//            subTotal+=total;
//            double discount = input.nextDouble();
//            discounted = ((discount/100) * subTotal);
            System.out.printf("%10s %10d %10.2f %10.2f%n", itemName.get(index), quantityList.get(index), priceList.get(index), total);


        }

    }


    public void moreItems(){
        System.out.println("Add more Items? ");
        String items = input.next();
        if(Objects.equals(items, "yes")){
            items();}
        else{
            cashierDetails();
        }
    }
    public void cashierDetails(){
        System.out.println("What is your name?");
        String cashier = input.next();
        System.out.println("How much discount will he get?");
        String discount = input.next();

    }

    public void vat(){
        double vat = 0.175 * subTotal;
    }





//    public static double sum(){
////        double price = Double.parseDouble(input.next());
////        double quantity = Double.parseDouble(input.next());
//        return price() * quantity();
//    }



































































































//    private Scanner input = new Scanner(System.in);
//    public String cashier;
//    public static void main(String[] args) {
//    customerName();
//
//        System.out.println("""
//                SEMICOLON STORES
//                MAIN BRANCH
//                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS
//                TELEPHONE NUMBER : 92345675438""");
//        System.out.println("CUSTOMER NAME");
//    }
//
//    public static void customerName(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is the Customer's name: ");
//        String name = input.next();
//        items();
//    }
//    public static void items(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What did the user buy? ");
//        String item = input.next();
//        System.out.println("How many pieces?");
//        String pieces = input.next();
//        System.out.println("How much per unit?");
//        String price = input.next();
//        moreItems();
//    }
//    public static void moreItems(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Add more Items? ");
//        String items = input.next();
//        if(Objects.equals(items, "yes")){
//            items();}
//        else{
//            cashierDetails();
//            }
//
//    }
//    public static void cashierDetails(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String cashier = input.next();
//        System.out.println("How much discount will he get?");
//        String discount = input.next();
//
//    }
}
