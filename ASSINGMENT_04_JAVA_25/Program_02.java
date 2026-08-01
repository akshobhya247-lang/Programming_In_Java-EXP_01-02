import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Emloyee ID :");
        String id  = sc.nextLine();
         
        System.out.println("Enter Basic Salary :");
        String salary  = sc.nextLine();

        System.out.println("Enter Bonus :");
        String bonus  = sc.nextLine();

        //Convert ting into Wrapper calss
        Integer basicSalary = Integer.valueOf(salary);
        Integer bonusAmount = Integer.valueOf(bonus);

        if(basicSalary < 0 || bonusAmount < 0)
        {
            System.out.println("Invalid Salry or Bonus !");
        }
        else
        {
            int netSalary = basicSalary + bonusAmount;

            System.out.println("\nEmployee ID: " + id);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus: " + bonusAmount);
            System.out.println("Net Salary: " + netSalary);
        }

            sc.close();
    }
    
}
