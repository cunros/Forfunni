import java.util.Scanner;

public class quizAverage 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean sigma = false;
        double q1=0.0;
        double q2=0.0;
        double q3=0.0;
        boolean again = false;
        boolean confrm = false;

        
        while(!again)
        {   

            sigma = false;

                while(!sigma)
                {

                    System.out.print("\n\nFirst quiz: ");
                    if(scanner.hasNextDouble())            
                    {q1 = scanner.nextDouble();sigma=true;}else{System.out.println("\nERR\nERR\n Not a numeber please input a number");scanner.next();}

                }

            sigma = false;
            
                while(!sigma)
                {

                    System.out.print("Second quiz: ");
                    if(scanner.hasNextDouble())            
                    {q2 = scanner.nextDouble();sigma=true;}else{System.out.println("\nERR\nERR\n Not a numeber please input a number");scanner.next();}

                }

            sigma = false;
            
                while(!sigma)
                {

                    System.out.print("Third quiz: ");
                    if(scanner.hasNextDouble())            
                    {q3 = scanner.nextDouble();sigma=true;}else{System.out.println("\nERR\nERR\n Not a numeber please input a number");scanner.next();}

                }

            double sum = q1+q2+q3;
            double ave = sum/3;    
            System.err.println("\n\n"+ave+" is your average!");
            
            confrm = false;
            while(!confrm)
            {
                System.out.print("\n\nCalculate again?Y/N: ");
                if(scanner.hasNext())
                {
                    String reap = scanner.next();
                    if(reap.equalsIgnoreCase("Y")){again = false;confrm=true;}else if(reap.equalsIgnoreCase("N")){again = true;confrm=true;}else{System.err.println("Invalid input");}
                }
                else{System.err.println("ERR\nERR\n\nplease put only a number");scanner.next();}

            }


        }
    }

}
