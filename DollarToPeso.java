import java.util.Scanner;

class DollarToPeso
{

    public static void main(String[]args)
    {

        System.out.println("\n\nDollar to peso\n\n");

        try(Scanner scanner = new Scanner(System.in))
        {

            boolean reap=true;

            while(reap)
            {

                double Dollarconv = 50.60;
                boolean isYN=false;
                boolean isNum=false;

                while(!isNum)
                {

                    System.out.print("\nInput dollar: ");
                    
                    if(scanner.hasNextDouble())
                    {

                        double dollar = scanner.nextDouble();
                        isNum= true;
                        System.out.println("\n\n"+dollar+" dollar(s) is "+Dollarconv*dollar+" In pesos");

                    }else{ System.out.println("Please input only numbers"); isNum=false; }

                }

                while(!isYN)
                {

                    System.out.print("\n\nConvert again?Y/N: ");
                    String YN = scanner.next();

                    if(YN.equalsIgnoreCase("Y"))
                    {

                        isYN = true;
                        reap = true;

                    }else if(YN.equalsIgnoreCase("N")){ isYN=true; reap=false; }else{ System.out.println("Please only put numbers\n"); }
                }

            }

        }

    }

}
