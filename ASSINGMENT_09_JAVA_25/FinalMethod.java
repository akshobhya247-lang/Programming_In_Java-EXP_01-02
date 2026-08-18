class Parent {
    final void display () {
        System.out.println("Final in Parent Class Method : ");
    }
}

class child extends Parent {
     // void display() {
    }



public class FinalMethod {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
