public class Prob_state {
    
    public static void main(String[] args)
    {
        //Primitive Data type 
        int num = 50;

        //Autoboxing (primitive to Wrapper Object)
        Integer obj = num;

        //Unboxing (Wrapper Object to Primitive)
        int value = obj;

        //Basic operation on wrapped value
        int result = value + 20;

        System.out.println("Primitivw Value  :" + num);
        System.out.println("Wrapper Object : " + obj);
        System.out.println("Unboxed value : " + value);
        System.out.println("Result : " + result);
        
    }

}
