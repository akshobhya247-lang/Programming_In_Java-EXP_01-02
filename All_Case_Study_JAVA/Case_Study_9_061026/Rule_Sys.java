class ExaminationRules {

    //Final variable : value can be assingned 
    final double examinationFee = 1000.0;

    //Final Method 
    final void calculateResult(int marks)
    {
        if (marks >= 40)
            System.out.println("Result PASS");
        else 
            System.out.println("Result FAIL");
    }

}
//Final Class : cannot be inherited 
final class ExaminationConfig{
    void displayConfig(){
        System.out.println("Examination Configuration");
        System.out.println("Examination Fees : Rs. 1000");
    }
}


public class Rule_Sys {

    public static void main(String[] args)
    {
        //Create ExaminationRules object 
        ExaminationRules rules = new ExaminationRules();
        
        System.out.println("Examination Free Rs. " +rules.examinationFee);

        rules.calculateResult(75);

        //Create Final class object 
        ExaminationConfig config = new ExaminationConfig();
        config.displayConfig();
    }
}
