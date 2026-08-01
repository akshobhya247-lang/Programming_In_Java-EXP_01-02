public class Program_01 
{
    public static void main(String[] args)
    {
        //Marks stored as String 
        String m1 = "75";
        String m2 = "25";
        String m3 = "95";

        //Convert String to Integer (Wrapper Class)
        int mark1 = Integer.parseInt(m1);
        int mark2 = Integer.parseInt(m2);
        int mark3 = Integer.parseInt(m3);

        int total = mark1 + mark2 + mark3;

        System.out.println("Mark 1 = " + mark1);
        System.out.println("Mark 2 = " + mark2);
        System.out.println("Mark 3 = " + mark3);
        System.out.println("Total Marks = " + total);

    }
}
