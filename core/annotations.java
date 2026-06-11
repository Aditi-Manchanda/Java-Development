//Annotations or Meta Data

@Deprecated
//it is a class level annotation
//it tells that this class will be deleted soon so prefer not to use it

class A
{
	public void showTheDataWhichBelongsToThisClass()
    //this is just a method name
	{
		System.out.println("in show A");
	}
}

class B extends A 
{
	@Override
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

public class annotations {
    public static void main(String[] args) {
    	
    	B obj=new B();
    	obj.showTheDataWhichBelongsToThisClass();
        //obj.showTheDataWhichBelongToThisClass();
        //this prints "in A show"
        //this is a bug as the method name is different belong-->belongs

        //@Override is an annotation

    	
    }
}

