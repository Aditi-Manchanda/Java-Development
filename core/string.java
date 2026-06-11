package core;
public class string {
    public static void main(String[] args) {
        
        String name= new String("navin"); // String name = "navin";
        System.out.println("hello " + name);
        System.out.println(name.charAt(2)); //outputs v
        // System.out.println(name.concat(" reddy")); 
        name = name + " reddy";

        String s1="navin";
        String s2="navin";   //string constant pool, dont create new obj in heap

        System.out.println(s1==s2);

        String s = "Hello"; // declare a string literal
        s.length();  // number of characters
        s.charAt(2);  // char at index 2
        s.indexOf("l");  // first index of substring
        s.lastIndexOf("l"); // last index of substring
        s.substring(1, 3);  // extract chars from index 1 to 2
        s.substring(2);  // extract from index 2 to end
        s.toUpperCase();  // convert all chars to uppercase
        s.toLowerCase();  // convert all chars to lowercase
        s.trim();  // remove leading/trailing whitespace
        s.strip();  // trim + handles unicode whitespace
        s.replace("l","r");  // replace all occurrences of char/string
        s.replaceAll("l+","r");  // replace using regex pattern
        s.contains("ell");  // check if substring exists → boolean
        s.startsWith("He");  // check if starts with prefix → boolean
        s.endsWith("lo");  // check if ends with suffix → boolean
        s.equals("Hello");  // compare content (use this, not ==)
        s.equalsIgnoreCase("hello");  // compare content ignoring case
        s.compareTo("Hi");  // lexicographic comparison → int
        s.isEmpty();  // true if length == 0
        s.isBlank();  // true if empty or only whitespace
        s.split(",");  // split by delimiter → String array
        s.toCharArray();  // convert to char array
        s.valueOf(42);  // convert int/char/bool/etc to String
        s.concat(" World");  // append string (same as + operator)
        s.intern();  // return canonical string from pool
        s.repeat(3);  // repeat string N times (Java 11+)
        String.join("-","a","b");  // join strings with a delimiter
        String.format("%s=%d");  // formatted string (like printf)

        //Mutuable and Immutable Strings
        /* By default strings are immutable
        To create mutable string work with string buffer */

        StringBuffer sb = new StringBuffer("navin");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());
        //append data
        sb.append("Reddy");

        System.out.println(sb); //prints reddy not navin

        String str=sb.toString();

        sb.deleteCharAt(2); 
        sb.insert(0,"Java ");
        sb.setLength(30);
        sb.capacity();  // current allocated buffer size
        sb.length();   // number of characters stored
        sb.append("Java");  // add text to the end
        sb.insert(0, "Java ");  // insert text at given offset
        sb.delete(1, 3);  // remove chars from index 1 to 2
        sb.deleteCharAt(2);  // remove single char at index
        sb.replace(0, 2, "Hi");  // replace chars in range with new string
        sb.reverse();  // reverse the entire sequence
        sb.charAt(1);  // get char at index
        sb.setCharAt(1, 'A');  // set char at index
        sb.indexOf("av");  // first index of substring
        sb.substring(2);  // extract from index 2 to end
        sb.setLength(30);  // resize: truncates or pads with nulls
        sb.toString();  // convert back to immutable String
        

    }
    
}
