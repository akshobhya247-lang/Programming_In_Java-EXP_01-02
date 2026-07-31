public class Sring_Casket_final 
{
    public static void main(String[] args) 
    {
        StringBuffer sb   = new StringBuffer("Hello");
        
        sb.append("World");
        System.out.println("After Apped : " + sb);

        sb.insert(6 ,"Java");
        System.out.println("After Inser :" + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After Replace :" +sb);

        sb.delete(2, 5);
        System.err.println("After Delete : " +sb);

        sb.reverse();
        System.out.println("After Reverse : " +sb);

    }
}
