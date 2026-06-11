//Exception Handling with try catch
//Exceptions are Runtime Errors

//Statement-->Normal, Critical
public class Exception2 {
    public static void main(String[] args) {
    
    
    int i=0;  //Normal Statement
    int j=0;
   
    //you can write multiple try blocks
    try
    {
    	j=18/i;    //Critical Statement
    }
    catch(Exception e)
    {
    	System.out.println("Something went wrong");
    }
    System.out.println(j);
    
    System.out.println("Bye");
    }
}