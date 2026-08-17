class Parent {
    void display () {
        System.out.println("Parent Class Method : ");
    }
}

class child extends Parent {
    void display() {
        super.display();
        System.out.println("Child class method");
    }
}

public class SuperExample{
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}