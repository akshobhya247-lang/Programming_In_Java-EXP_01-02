class Calculator 
{

    static int count = 0 ; 

    //Overloaded method for integer addition 
    double add(double a , double b )
    {
        count ++;
        return a + b;
    }

    //Static Variable 
    static void showCount()
    {
        System.out.println("Total Calculations = " + count);
    }

    public static void main(String[] args)
    {
        Calculator c = new Calculator() ;

        System.out.println("Interger Addition = " + c.add(15 , 25));
        System.out.println("Decimal Addition = " + c.add(10.5 , 20.8));

        Calculator.showCount();

    }

}