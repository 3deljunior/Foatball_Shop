package Project;

public class Customer {
   private String custName;
   private int numOfItems=1;
    FootballShop[] itemList =new FootballShop[10];
   private double totalPay;
    Customer(String custName){
    this.custName=custName;
    }
    String getName(){
        return custName;
    }
    double getTotalPay(){
        return numOfItems;
    }
    int getNumOfItems() {
        return numOfItems;
    }
    void buy(FootballShop item){
    itemList[numOfItems]=item;
    System.out.println(" Item "+getNumOfItems());
    itemList[numOfItems].display();
    totalPay+=itemList[numOfItems].calcPrice();
    numOfItems++;
    }
    @Override
    public String toString() {
        return " Welcome "+custName+"\n\n List of Football Items Bought \n";
    }
    void print(){
       System.out.println(" Total = $"+totalPay+"\n"); 
    }
}
