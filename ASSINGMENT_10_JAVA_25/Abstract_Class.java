abstract class AbstractClass {
    abstract void draw();


void messege(){
    System.out.println("This is a Shape ");
}

}

class Circle extends Shape{
    void draw(){
        System.out.println("Draawing Circle");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.messege();
    }
}