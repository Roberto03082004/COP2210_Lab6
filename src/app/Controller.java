package app;

import things.Items;

public class Controller {
    public static void main(String[] args){
        yourInfoHeader();

        Items item1 = new Items("Apple", 1.29);
        item1.info(true);
        System.out.println();
        item1.info(false);
        Items item2 = new Items("Milk", 5.69, 25, 0.153);
        Items item3 = new Items("Water", 2.19, 50, 0.05);
        item2.info(true);
        item3.info(true);
        System.out.println();

        //Step 8
        if (item2.getPrice() > item1.getPrice()) {
            System.out.println("Milk has greater price. Price of Milk: " + item2.getPrice());
        } else {
            System.out.println("Apple has greater or equal price. Price of Apple: " + item1.getPrice());
        }//end of if statement
        System.out.println();

        //Step 9
        if(item1.getDiscount() < 0.05){
            System.out.println("Apple discount is less than 0.05. The discount is " + item1.getDiscount());
        } else if (item1.getDiscount() < 0.10) {
            System.out.println("Apple discount is less than 0.10. The discount is " + item1.getDiscount());
        }else if(item1.getDiscount() < 0.15) {
            System.out.println("Apple discount is less than 0.15. The discount is " + item1.getDiscount());
        }else{
            System.out.printf("Apple discount is greater or equal to 0.15. The discount is %.3f\n", item1.getDiscount());
        }//end of if statement
        System.out.println();

        //Step 10
        if(item3.getPrice() >= 3.99 || item1.getDiscount() < 0.17){
            if(item2.getDiscountQuantity() == 18){
                System.out.println("Milk discount quantity equals 18");
            }else{
                System.out.println("Milk discount quantity low");
            }
        }else if(item3.getDiscount() < 0.01){
            System.out.println("Water discount is less than 0.01. The discount is " + item3.getDiscount());
        }else if(item3.getDiscount() < 0.05) {
            System.out.println("Water discount is less than 0.05. The discount is " + item3.getDiscount());
        }else if(item3.getDiscount() < 0.15) {
            System.out.printf("Water discount is less than 0.015. The discount is %.3f", item3.getDiscount());
        }//end of if statement

    }//end of main



    public static void yourInfoHeader(){
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASS TIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 6");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and i certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();

    }//end of yourInfoHeader

}//end of Controller
