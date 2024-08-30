package Project;

public class Boots extends FootballShop implements DiscConsiderable{
    int size;
   
    Boots(){
        
    }
    Boots(String brand, double price, int quantity,int size){
        super(brand, price, quantity);
        this.size=size;
    }
    @Override
    boolean Equal(Boots f,Boots f2) {
        if(f.getBrand().equals(f2.getBrand())&&f.getPrice()==f2.getPrice()&&f.size==f2.size)
        return true;
        return false;
    }
    @Override
    void display() {
       System.out.println(" SOCCER BOOTS\n Brand: "+getBrand()+"\n price: $"+getPrice()+" for size "+size
       +"\n Discount: 17.0%"+"\n Quantity: "+getQuantity()+"\n Subtotal: $"+calcPrice()+"\n");
    }
    @Override
    public double calcDisc() {
        return (getPrice()-(RATE*getPrice()));
    }
    @Override
    double calcPrice() {
        return calcDisc()*getQuantity(); 
    }
}
