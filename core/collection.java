//Collection API
//

/*
Collection API -> concept
Collection -> Interface
Collections -> classe with multiple methods
			    different type of data structures
*/

//LIFO-->Stack
//FIFO-->Queue

//List (ArrayList, LinkedList ), Queue (DeQueue), Sets (HashSet, Linked HashSet) implement Collection interface

//Array List
import java.util.ArrayList;
import java.util.List;

public class collection {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums= new ArrayList<Integer>();
//  	Collection nums=new ArrayList();
    	List<Integer> nums=new ArrayList<Integer>();
		//List support Index value while collection doesn't
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");

		//System.out.println(nums);  //prints [6, 5, 8, 2]
    	
    	System.out.println(nums.get(2));
    	
    	System.out.println(nums.indexOf(2));
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(nums);	// prints each number in seperate line
//    	}
    	for(Object n:nums)
    	{
    		int num=(Integer)n;
    		System.out.println(nums);	
    	}
    }
}
