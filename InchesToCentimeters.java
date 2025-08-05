import java.util.Scanner;

class InchesToCentimeters
{

    public static void main(String[]args)
    {

        System.out.println("*********\nInches to centimeters converter");

        try(Scanner scanner = new Scanner(System.in))
        {

            boolean reap=true;
            double Conv = 2.54;

            
            while(reap)
            {

                boolean isYN=false;
                boolean isNum=false;


                while(!isNum)
                {

                    System.out.print("\nInput inches:");
                    if(scanner.hasNextDouble())
                    {

                        double inches = scanner.nextDouble();
                        System.out.println(inches+" Inches in centimeters is "+ Conv*inches);
                        isNum=true;

                    }else{ System.out.println("Not a number!");scanner.next(); }

                }
                
                while(!isYN)
                {

                    System.out.print("\nConver again?Y/N ");
                    String YN = scanner.next();
                    
                    if(YN.equalsIgnoreCase("Y"))
                    {

                        isYN=true;
                        reap = true;

                    }else if(YN.equalsIgnoreCase("N")){ reap=false; isYN =true; } else{ System.out.print("\nInput only Y or N!!"); isYN=false;}

                }

            }


        }


    }

}
