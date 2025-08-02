import java.util.Scanner;

public class InchesToCentimeters 
{
    public static void main(String[] args) 
    {   

        boolean end = false;
        double inchestocentimeters = 2.54;

        try(Scanner scanner = new Scanner(System.in))
        {
            while (end == false)
            {
                boolean validnum = false;
                double inches = 0.0;
                while(validnum == false)
                {

                    System.out.print("\n\nEnter length in inches: ");
                    if(scanner.hasNextDouble())
                    {
                        inches = scanner.nextDouble();
                        validnum = true;
                    }
                    else
                    {
                        System.out.println("ERR\nERR\n\n\nNot a number! Please input numbers only\n\n");
                        scanner.next();
                    }

                }

                double centimeters = inches * inchestocentimeters;
                System.out.println("\n\n"+inches+" inches is "+centimeters+" in centimeters\n\n");
                
                System.out.print("Convert Again? Y/N: ");   
                String repeat = scanner.next();
            
                if(!repeat.equalsIgnoreCase("Y"))
                {
                    end = true;
                }
            }

            scanner.close();   
        
        }
    
    }

}
