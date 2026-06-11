//forEach Method

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);

		//forEach takes an object of Consumer
    	
//    	Consumer<Integer> con=new Consumer<Integer>() {
//    		
//    		public void accept(Integer n)
//    		{
//    			System.out.println(n);
//    		}
//    	};
    	
    	Consumer<Integer> con= n -> System.out.println(n);

		//OR
 
    	nums.forEach(n -> System.out.println(n));
   
 //  	nums.forEach(null);
 //   	nums.forEach(con);
    	
    	
    	//nums.forEach(n -> System.out.println(n));
    	
    }
}