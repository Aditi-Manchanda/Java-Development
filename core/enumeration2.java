//Enumeration

enum Laptop{
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);

    private int price;
    //the value is a constructor
    private Laptop(int price){
        this.price=price;
    }
    //bcz method is private create getters and setters

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}
public class enumeration2 {
    public static void main(String[] args) {

        Laptop lap= Laptop.Macbook;
        System.out.println(lap+" "+lap.getPrice());

        //for all prices
        for (Laptop lap1 : Laptop.values()){
            System.out.println(lap+" "+lap.getPrice());
        }

        
    }
    
}
