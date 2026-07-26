class Student{
    int id; 
    String name;


//Default Constructor 
Student(){

    id = 0 ; 
    name = "Not Assigned" ; 
}

//Parametrized Constructor 
Student(int i , String n)
{
    this.id = i;
    this.name = n ; 
}

//Copy Constructor 
Student(Student s)
{
    id = s.id;
    name = s.name;
}
//Display Method 
void display () {
    System.out.println("ID :" + id);
    System.out.println("Name :" + name);
    System.out.println();

}

public class ConstructorDemo{

    public static void main(String[] args){

        //Default Constructor 
        Student s1 = new Student();

        //Parametrized Constructor 
        Student s2 = new Student(101 , "Akshu");

        //Copy Constructor 
        Student s3 = new Student(s2);

        System.out.println("Default Constructor :");
        s1.display();

        System.out.println("Parameterized Constructor : ");
        s2.display();

        System.out.println("Cpoy Constructor :");
        s3.display();
    }

}



}