//LOCAL VARIABLE TYPE INFERENCE
//SEALED CLASSES
//RECORD CLASSES

import java.util.Objects;

sealed class A permits B,C{

}
non-sealed class B extends A{

}  
final class C extends A{
    //This class should extend A and it can be declared as sealed, final, or non-sealed. In this case, we declare it as final, which means that no other class can extend C.
}

class D extends B{
    // This class is not allowed to extend A because A is a sealed class and only B and C are permitted to extend it.
}

sealed interface X permits Y,Z{

}
non-sealed interface Y extends X{

}
non-sealed interface Z extends X{
    // This interface should extend X and it can be declared as sealed or non-sealed. 
    // It cant be final
}
class Programmer{
    private final int id;
    private final String name;

    public Programmer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Programmer{id=" + id + ", name='" + name + "'}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Programmer other = (Programmer) obj;
        return id == other.id && name.equals(other.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }
}

record ProgrammerRecord(int id, String name){
    // This is a record class that automatically generates the constructor, getters, toString, equals, and hashCode methods based on the declared fields.
    //By deault, the fields in a record class are final and cannot be modified after the object is created.
    //They are also private and cannot be accessed directly from outside the class. Instead, you can use the automatically generated getter methods to access the field values.
    
}

class Alien {
    // This is a simple class to demonstrate the use of var with object instantiation
}
class extra{
    public static void main(String[] args) {
        var a = 10;
        // instead of declaring a variable with a specific type, we can use var and the compiler will infer the type based on the assigned value

        var b = "Hello, World!";
        // the type of b will be inferred as String

        //var a;
        // this will cause a compilation error because the compiler cannot infer the type of a without an assigned value

        var c = 3.14;
        // the type of c will be inferred as double

        String var = "This is a variable named var";
        // we can also use var as a variable name, but it is not recommended as it can lead to confusion and is not considered good practice
        
        //var cant be used with a class name
        // var String = "This will cause a compilation error";

        var nums = new int[10];
        // the type of nums will be inferred as int[]

        var obj= new Alien();
        // the type of obj will be inferred as Alien

        Programmer prog = new Programmer(1, "John Doe");
        System.out.println("Programmer ID: " + prog.getId());
        System.out.println("Programmer Name: " + prog.getName());
        
        Programmer prog2 = new Programmer(1, "John Doe");
        System.out.println(prog.equals(prog2));

        ProgrammerRecord progRecord = new ProgrammerRecord(2, "Jane Doe");
        System.out.println(progRecord);
        ProgrammerRecord progRecord2 = new ProgrammerRecord(2, "Jane Doe");
        System.out.println(progRecord.equals(progRecord2));

        //ProgrammerRecord progRecord3 = new ProgrammerRecord();
        // This will cause a compilation error because the record class does not have a no-argument constructor.

    }
}