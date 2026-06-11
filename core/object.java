//Object class
class Laptop{
    String model;
    int price;

    public String toString(){
        return "Hey";
    }
    public boolean equals(Laptop that){

        return this.model.equals(that.model) && this.price==that.price;
        
        /*if (this.model.equals(that.model) && this.price==that.price){
            return true;
        } else 
            return false;
        */
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    //Right click--> Source Action--> Generate 


}
public class object {
    public static void main(String[] args) {
        Laptop obj= new Laptop();
        obj.model="Lenovo";
        obj.price=1000;

        System.out.println(obj); //Laptop@as041f3 
        //bcz it is by default read as
        //System.out.println(obj.toString());
        //it returns "class name @ hashcode(hexadecimal)"

        //if public string toString exists in Laptop class then it takes that method and prints "Hey"
        
        Laptop obj2= new Laptop();
        obj2.model="Lenovo";
        obj2.price=1000;

        boolean result= obj.equals(obj2); //obj1==obj2
        System.out.println(result); //False
        //It will give true if we include equals method in Laptop class
    
    }
    
}

