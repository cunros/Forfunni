import java.util.Scanner;

public class testSum
{

    public static void main(String[] args) 
    {
        
        try(Scanner scanner = new Scanner(System.in))
        {
            int ifTwelve = 0;

            System.out.println("Hello, you must add two numbers together that sums up to twelve. Or DIE!\n******************\n");

            while(ifTwelve != 12)
            {

                boolean isANumber = false;
                int n1=0;
                int n2=0;

                while(!isANumber)
                {

                    System.out.print("First number: ");
                    if(scanner.hasNextInt())
                    {

                        n1 = scanner.nextInt();
                        isANumber = true;

                    }
                    else{System.out.println("Put a number!!");isANumber=false;scanner.next();}

                }
                
                isANumber = false;

                while(!isANumber)
                {

                    System.out.print("Second number: ");
                    if(scanner.hasNextInt())
                    {

                        n2 = scanner.nextInt();
                        isANumber = true;

                    }
                    else{System.out.println("Put a number!!");isANumber=false;scanner.next();}

                }
            
                int FN = n1+n2;
                if(FN != 12)
                {

                    System.out.println("That does not add up to 12!!\n");

                }
                else if(FN==12)
                {
                    ifTwelve = 12;
                    System.out.println("\n\nWow that adds up to "+ifTwelve);

                }
                
            }

        }

    }

}
