class parent {

    parent() {
        System.out.println("Parent class constructor : ");
    }
    
}

class Child extends parent {
    
    Child() {
        super();
        System.out.println("Child class constructor : ");
    }
    
}


public class Super {
    public static void main(String[] args) {
        new Child();
    }
    
}
