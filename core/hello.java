class Hello {
    public static void main(String a[]){
        System.out.println("Hello World");
        System.out.println(3+5);
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(num1+num2);
        System.out.println(result);
        double marks = 6.5; //by default java takes decimal in double
        float number = 6.5f; //convert to float by this or by "float num= (float)6.5;"
        System.out.println(marks);
        System.out.println(number);
        byte dec=8; //from 2^-7 to 2^7 - 1
        System.out.println(dec);
        char c ='k'; //single quote and single letter is acceptable
        boolean b= true; //not bool
        long l= 5844l;
        int num5 = 0b101; //prints 5 as binary of 5 is 101
        int num6 = 0x7E; //prints 126 as hexadecimal format
        int num7 = 10_00_00_00; //it prints normal number but you can just put underscore to count the number of zeros
        double num8 = 12e10;
        c++; //prints +1 to k which is l


        //TYPE CONVERSION AND CASTING
        byte b1=127;
        System.out.println(b1);
        int a1=256;
        int a2=b1; //works
        //b=a wont work as range of b is smaller and a is bigger 
        //b=(byte)a;   This is explicit casting 
        a1=b1; //conversion
        float f1=5.6f;
        int x=(int)f1; 
        byte a3=10;
        byte b3=30;
        int result3 = a3 * b3; //Type Promotion
        System.out.println(result3);


        //OPERATORS
        int result2 = num1-num2;
        int result4 = num1/num2; //only get quotient
        int result5 = num1%num2; //give remainder
        num1 = num1 + 2; //num+=2; num-=2; num*=2;
        num1++; //increment
        //++num1;    pre-increment behaves differently when we fetch value
        int result6= ++num1; //incremented value will be assigned to result6
        int result7= num1++; //first fetch value of num and give to result7 then increase value


        //RELATIONAL OPERATORS AND LOGICAL OPERATORS
        boolean result8 = num1<num2;
        // <= >= == < > != && || !
  

    }
}