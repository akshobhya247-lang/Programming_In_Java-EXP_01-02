
import java.util.Vector;

public class Lab_05_1 {

    public static void main(String[] args) 
    {
        Vector<Double> numbers = new Vector<>();

        numbers.add(100.1);
        numbers.add(200.4);
        numbers.add(300.3);
        numbers.add(400.4);
        
        System.out.println("vector :" +numbers);

        numbers.remove(1);
        numbers.remove(2);

        System.out.println("After removing index 1 :" + numbers);

        System.out.println("Size :" + numbers.size());
        System.err.println("Element at Index 0 : " + numbers.get(0));


    } 
}