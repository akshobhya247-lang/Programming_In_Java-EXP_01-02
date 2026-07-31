import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<>();    

        fruits.add("Apple");
        fruits.add("Bnanan");
        fruits.add("Kiwi");
        fruits.add("Cherry");
        fruits.add("Dragon Fruits");

        System.out.println("\n");

        System.out.println("Fruits : " +fruits);
        fruits.remove("Bnanan");
        fruits.remove("Apple");
        fruits.remove("Kiwi");
        fruits.remove("Cherry");

        System.out.println("After Removing : " + fruits);

    }   
    
}
