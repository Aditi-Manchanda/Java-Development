//Exception "throw" keyword

public class Exception5 {
    public static void main(String[] args) {
    	
//    	int i=2;
    	int i=0;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
				//call the catch block
    			throw new ArithmeticException("I don't want to print zero");
				//we can pass a message in the constructor if we want
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;

			//j=18/1; handle the exception
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}
