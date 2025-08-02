import java.util.Scanner;

public class testLetterF
{

    public static void main(String[]args)
    {

        try(Scanner scanner = new Scanner(System.in))
        {
            boolean reap = false;

            while(!reap)
            {

                System.out.print("Please put the letter F: ");
                String F = scanner.next();

                if (F.equalsIgnoreCase("F"))
                {

                    System.out.println("Congrats you inputted: "+F);
                    reap = true;

                }
                else
                {

                    System.out.print("Not it boss try again\n");
                    reap = false;

                }

            }
            scanner.close();
        }

    }

}
