//Need for interface
//Losely coupled program
//can use interface instead of abstract
abstract class Computer{
    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("code, compile, run:faster");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
        System.out.println("coding..");
    }
}
public class interfaces2 {
    public static void main(String[] args) {
        Computer laps=new Laptop();
        Computer desk=new Desktop();

        Developer navin= new Developer();
        navin.devApp(laps);
    }

}

/*
Types of Interface:-
1. Normal interface
	- an interface having two or more methods
2. Functional interface (SAM)
	- SAM => Single Abstract Method interface
3. Marker interface
	- an interface that as no methods (blank interface) */