
public class arr {
    public static void main(String[] args) {
        //ARRAY
        int nums[]={3,7,2,4};
        int random=0;
        System.out.println(nums[0]);

        nums[1]=6; //change value in array
        int numx[]=new int [4]; //Array 0-3 with all values 0
        numx[0]=2;
        numx[3]=4;

        for(int i=0; i<4; i++){
            System.out.println(nums[i]);
        }
        
        //Multi-dimensional array
        int numy[][]=new int[3][4]; 

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                numy[i][j] = (int)(Math.random() * 10);
                System.out.print(numy[i][j] + " ");
            }
            System.out.println();
        }

        //Enhanced for loop
        for(int n[]:numy){  //n=each row (a 1D int array)
            for (int m:n){  //m=each element in that row
                System.out.println(m + " ");
            }
            System.out.println();

        }

        /* Use the traditional `for` loop when you need index access, want to 
        modify the array, or don't mind verbosity; use for-each when you're just 
        reading/iterating and want cleaner code. */

        //JAGGED ARRAY - FIXED ARRAY NOT FIXED COLM
        int numj[][]=new int[3][];

        numj[0]=new int[3];
        numj[1]=new int[4];
        numj[2]=new int[3];

        //nums.length for array length and u can use it in loop like i<nums.length

        //Array of Objects


        Student s1= new Student();
        s1. rollno=1;
        s1.name="Navin";
        s1.marks=88;

        Student s2= new Student();
        s2. rollno=2;
        s2.name="Harsh";
        s2.marks=67;

        Student s3= new Student();
        s3. rollno=3;
        s3.name="Kiran";
        s3.marks=97;

        Student students[]= new Student[3];   //creating an array to hold student reference
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        for(Student stud:students){     //For Each OR Enhanced For Loop
            System.out.println(stud.name+" : "+stud.marks);
        }

        int numk[]= new int [4];
        numk[0]=4;
        numk[1]=8;
        numk[2]=3;
        numk[3]=9;

        for (int n:nums){
            System.out.println(n);
        }
    }
}
class Student {
    int rollno;
    String name;
    int marks;
}
//Only one public class is allowed per .java file, and it must match the filename. So inside arr.java, the Student class must not have the public keyword.

