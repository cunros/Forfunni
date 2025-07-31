import java.util.Scanner;

public class DollarToPeso 
{
    public static void main(String[] args) 
    {   

        boolean end = false;
        double dollarconver = 50.60;
        double dollar = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (end == false)
        {
            boolean validnum = false;
            while(validnum == false)
            {

                System.out.print("\n\nEnter amoount of dollars: ");
                if(scanner.hasNextDouble())
                {
                    dollar = scanner.nextDouble();
                    validnum = true;
                }
                else
                {
                    System.out.println("ERR\nERR\n\n\nNot a number! Please input numbers only\n\n");
                    scanner.next();
                }

            }

            double pesos = dollar * dollarconver;
            System.out.println("\n\n"+dollar+" USD is "+pesos+" in PHP\n\n");
            
            System.out.print("Convert Again? Y/N: ");   
            String repeat = scanner.next();
           
            if(!repeat.equalsIgnoreCase("Y"))
            {
                end = true;
            }


        }
        
        
    }

}
