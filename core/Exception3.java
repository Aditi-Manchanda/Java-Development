//try with multiple catch block

public class Exception3 {
    public static void main(String[] args) {
    	
    	int i=2;
  //  	int i=0;
    	int j=0;
    	
    	int nums[]=new int[5];
    	String str=null;
    	
    	try
    	{
    		j=18/i;  //Arithmetic Exception
    		System.out.println(str.length());
    		System.out.println(nums[1]);
    		System.out.println(nums[5]);  //index no ends at 4 so it gives error
    	}
//    	catch(Exception e)
//    	{
//  
//    		System.out.println("Something went wrong."+e);   //prints exception as well
//    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Cannot divide by zero");
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Stay in your limit.");
    	}
    	catch(Exception e)  //This is the parent exception class so it should be at bottom and child should be at top
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}
