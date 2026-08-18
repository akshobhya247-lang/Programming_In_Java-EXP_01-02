class Parent { 
    final void display () { 
        System.out.println("Final in Parent Class Method :"); 
    } 
} 

class child extends Parent { 
    void displayChild(){ 
        display(); 
        System.out.println("Child class method"); 
    } 
} 

public class Final_wrk { 
    public static void main(String[] args) { 
        child c = new child(); 
        c.displayChild(); 
    } 
}
