public class String_05_03_str {

    public static void main(String[] args) 
    {
        
        String str = " Java Programming " ;

        System.out.println("Length :" + str.length());
        System.out.println("Trimmed : " +str.trim());
        System.out.println("Uppercase  :" +str.toUpperCase());
        System.out.println("SubString : " +str.substring(2,6));
        System.out.println("Replaced Java with Python : " +str.replace("Java", "Pyyhon"));
        
    }
    
}
