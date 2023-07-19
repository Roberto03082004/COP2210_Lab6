package things;

public class Items  {

    private String name;
    private double price;
    private int discountQuantity;
    private double discount;


    public Items(String name, double price){
        this.name = name;
        this.price = price;
        discountQuantity = 20;
        discount = 0.2;

    }//end of items constructor

    public Items(String name, double price, int discountQuantity, double discount){
        this.name = name;
        this.price = price;
        this.discountQuantity = discountQuantity;
        this.discount = discount;

    }//end of items constructor

    public String getName(){
        return name;
    }//end of getName
    public void setName(String name){
        this.name = name;
    }//end of setName
    public double getPrice(){
        return price;
    }//end of getPrice
    public void setPrice(double price){
        this.price = price;
    }//end of setPrice
    public int getDiscountQuantity(){
        return discountQuantity;
    }//end of getDiscountQuantity
    public void setDiscountQuantity(int discountQuantity){
        this.discountQuantity = discountQuantity;
    }//end of setDiscountQuantity
    public double getDiscount(){
        return discount;
    }//end of getDiscount
    public void setDiscountPercentage(double discount){
        this.discount = discount;
    }//end of setDiscountPercentage
    public void info (boolean showHeader){

        if(showHeader == true){
            System.out.println("--------------------------------");
            System.out.println("Info: \t\t\t\t" + name);
            System.out.println("--------------------------------");
            System.out.println("Name: \t\t\t\t" + name);
            System.out.println("Price: \t\t\t\t" + price);
            System.out.println("discountQuantity: \t" + discountQuantity);
            System.out.printf("discount: \t\t\t%.3f\n", discount);

        }else{
            System.out.println("Name: \t\t\t\t" + name);
            System.out.println("Price: \t\t\t\t" + price);
            System.out.println("discountQuantity: \t" + discountQuantity);
            System.out.printf("discount: \t\t\t%.3f\n", discount);
        }


    }//end of info



}//end of items
