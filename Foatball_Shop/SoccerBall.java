package Project;

public class SoccerBall extends FootballShop {
   private int ballType;
    SoccerBall(){
    }
    SoccerBall(String brand, double price, int quantity,int ballType){
        super(brand, price, quantity);
        this.ballType=ballType;
    }
    @Override
    double calcPrice() {
        return getQuantity()*getPrice();
    
    }
    @Override
    void display() {
       System.out.println(" SOCCER BALL\n Brand:"+getBrand());
       try {
       if (ballType!=1&&ballType!=2&&ballType!=3&&ballType!=4){
        throw new Exception();}
    }
       catch (Exception e) {
        System.out.println(" "+ballType+" Not a valid soccer ball type, Changing the soccer ball type to\n training ball");
        ballType=3;
        System.out.println( "\n SOCCER BALL\n Brand:"+getBrand());
    }
        String type="";
        switch (ballType) {
        case 1:
            type="Professional Match"; setPrice(200);
            break;
        case 2:
            type="Match"; setPrice(80);
            break;
        case 3:
            type="Training"; setPrice(50);
            break;
        case 4:
            type="Recreational"; setPrice(20);
            break;
        default:
            break;
        }
       System.out.println(" Type :"+type+"\n price:$"+getPrice()+"\n No Discount!"
        +"\n Quantity:"+getQuantity()+"\n Subtotal: $"+calcPrice()+"\n");
    }
   
}
