package Project;

abstract public class FootballShop {
  private  String brand;
  private  double price;
  private  int quantity;
    FootballShop(){
        
    }
    FootballShop(String brand, double price, int quantity){
        this.brand=brand;
        this.price=price;
        this.quantity=quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    abstract boolean Equal(Boots f,Boots f2);
    abstract void display();
    abstract double calcPrice();
}
