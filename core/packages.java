package core;
import java.util.ArrayList;
//by default this line
import java.lang.*;  //means all files in java.lang 
public class packages {
    public static void main(String[] args) {
        ArrayList list= new ArrayList<>();
    }
    
}
//you can access packages in the same folder only or you can do
//import core.packages for every file u wanna use outside the core package

//Access Modifiers
/*
public class A{       //can be used anywhere in and outside package
    int marks = 6;     //cant be accessed outside package make it public to access outside package
    private int marks;   //can only be used in same class irrespective of package
    //by default any variable can be accessed only in same package
    protected int marks;  //cant be accessed outside package but can be accessed in sub class outside package
    public void show(){
    }
} 
    
//Class and Methods can be public
//Avoid default
*/