public class control {
    public static void main(String args[]){
        //Conditional Statements
        int x=8;
        if(x>10)
            System.out.println("Hello");
        if(false)
            System.out.println("Hello");
        //Put any conditions inside if()
        System.out.println("Bye");
        // if( ) else if( ) else 
        // Java doesn't have any indentation

        //Terminal Operator
        int n=5;
        int result=0;
        result=n%2==0? 10:20; //10 if false else 20

        //Switch Statement

        int a=1;
        switch(a){
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:   
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");
        }


        // LOOPS- for, do while, while

        int i=1;
        while (i<=4) {
            System.out.println("Hii"+ i); //+ here just concatenates
            i++;
        }
        
        do{
            System.out.println("Hii"+ i); //+ here just concatenates
            i++;   
        }while(i<=4); //gives output min once as cond is checked later on

        for(int j=1; j<=4; j++){
            System.out.println("Hii"+j);
        }
        //in reading file use while loop
        
    }
    
}
