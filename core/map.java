//Map

//it doesnt extend or implement collection interface

//instead of index value we can have names for array list and it can be stored in map
//map is a collection of key and a value pair
//Map<K,V>  it can be replaced with datatypes - float, int, string, etc

import java.util.Hashtable;
import java.util.Map;

public class map {
    public static void main(String[] args){   
    	
//    	Map<String, Integer> students=new HashMap<>();
    	Map<String, Integer> students=new Hashtable<>();  //HashMap and HashTable works almost same
		//HashTable is synchronized
    	
    	students.put("Navin",56);
    	students.put("Harsh",23);
    	students.put("Sushil",67);
    	students.put("Kiran",92);
    	students.put("Harsh",45);  //the old harsh got replaced as key cant be repeated although value can be repeated

		//System.out.println(students);  //for all students
		//System.out.println(students.get("Harsh"));  //for a particular key print value
    	
    	System.out.println(students.keySet());  //this gives all the keys
    	
    	for(String key : students.keySet())
    	{
     		System.out.println(key + ":" + students.get(key));
    	}
    	
    }
}