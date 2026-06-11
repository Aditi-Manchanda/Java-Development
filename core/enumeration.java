//Enumerations
//when we have specific constants we want to use we can crate enum instead of objects
enum Status{
    Running, Failed, Pending, Success;
    //these are named constants
    //by default the numbers are 0,1,2,3 based on order
}
//Can't extend enum with another class
//Other than this enum is a class

public class enumeration {
    public static void main(String[] args) {
        //just like int i=5;
        Status s = Status.Running;
        Status p = Status.Success;
        System.out.println(s); 
        System.out.println(p.ordinal());
        //ordinal returns the number

        System.out.println(s.getClass().getSuperclass());

        Status[] m = Status.values();
        System.out.println(m[0]);

        //to print all use enhanced for loop
        for (Status ss:m){
            System.out.println(ss + " "+ ss.ordinal());
        }

        if (s==s.Running)
            System.out.println("All good");
        else if(s==s.Pending)
            System.out.println("Please wait");
        else if (s==s.Success)
            System.out.println("Done");
        else 
            System.out.println("Try Again");

        switch (p){
            case Running:
                System.out.println("All good"); 
                break;
            case Failed:
                System.out.println("Try again"); 
                break;
            case Pending:
                System.out.println("Please wait"); 
                break;
            default:
                System.out.println("Done");
                break;
        }
    }

}
    

