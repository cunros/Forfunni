import java.util.Scanner;
public class mathmodernseries {
    
    public static void main(String[]arg)
    {

        try(Scanner scanner = new Scanner(System.in))
        {

            String number = "please ony input a number";
            boolean correct = false;
            boolean isOp;
            int OP = 0;
            double r = 0;
            int a1 =0;
            int d=0;
            double n =0;
            double answer;
            boolean agg = false;

            while(!agg)
            {
                isOp = false;
                while(!isOp)
                {
                    System.out.print("\n[1]Arithmetic\n[2]Geometric\nPlease select operation: ");
                    if(scanner.hasNextInt())
                    {
                        OP = scanner.nextInt();
                        if(OP>4 || OP==0)
                        {

                            System.out.print("\nPlease only input 1,2\n");
                            isOp=false;

                        }else{isOp=true;}

                    }else{System.out.print("\nPlease only input 1,2\n");scanner.next();}

                }

                isOp = false;

                while(!isOp)
                {

                    if(OP == 1)
                    {

                        while(!correct)
                        {

                            System.out.print("\n\ninput a1: ");
                            if(scanner.hasNextInt())
                            {

                                a1 = scanner.nextInt();
                                correct = true;

                            }else{System.out.println(number);scanner.next();}

                        }

                        correct = false;

                        while(!correct)
                        {

                            System.out.print("Input d: ");
                            if(scanner.hasNextInt())
                            {

                                d = scanner.nextInt();
                                correct = true;

                            }else if(d == 0){System.out.print("\nd cannot be equal to zero!\n");correct=false;scanner.next();}
                            else{System.out.println(number);scanner.next();}

                        }

                        correct = false;

                        while(!correct)
                        {

                            System.out.print("Input n: ");
                            if(scanner.hasNextInt())
                            {

                                n = scanner.nextInt();
                                correct = true;

                            }else if(n == 0){System.out.print("\nn cannot be equal to zero!\n");correct=false;scanner.next();}
                            else{System.out.println(number);scanner.next();}

                        }

                        correct = false;

                        double step1 = n - 1;
                        double step2 = step1 * d;
                        double step3 = step2 + a1;
                        answer = step3;

                        double sstep1 = n/2;
                        double sstep2 = a1+answer;
                        double sstep3 = sstep1*sstep2;
                        double summ = sstep3;
                        System.out.println(sstep1);

    
                        System.out.print("\n\nthe "+n+" term is "+answer);
                        System.out.print("\nand the sum of all numbers until the "+n+" term is "+summ);
                        isOp = true;

                    }
                    else if(OP==2)
                    {

                        while(!correct)
                        {

                            System.out.print("\n\ninput a1: ");
                            if(scanner.hasNextInt())
                            {

                                a1 = scanner.nextInt();
                                correct = true;

                            }else{System.out.println(number);scanner.next();}

                        }

                        correct = false;

                        while(!correct)
                        {

                            System.out.print("Input r: ");
                            if(scanner.hasNextInt())
                            {

                                r = scanner.nextInt();
                                correct = true;

                            }else if(d == 0){System.out.print("\nr cannot be equal to zero!\n");correct=false;scanner.next();}
                            else{System.out.println(number);scanner.next();}

                        }

                        correct = false;

                        while(!correct)
                        {

                            System.out.print("Input n: ");
                            if(scanner.hasNextInt())
                            {

                                n = scanner.nextInt();
                                correct = true;

                            }else if(n == 0){System.out.print("\nn cannot be equal to zero!\n");correct=false;scanner.next();}
                            else{System.out.println(number);scanner.next();}

                        }

                        correct = false;

                        double ssstep1 = n-1;
                        double ssstep2 = Math.pow(r,ssstep1);
                        double ssstep3 = ssstep2*a1;
                        System.out.print("\n\nThe "+n+" term of the sequence is "+ssstep3);

                        double smtep1 = Math.pow(r,n);
                        double smtep2 = 1-smtep1;
                        double smtep3 = 1-r;
                        double smtep4 = smtep2/smtep3;
                        double smtep5 = smtep4*a1;
                        System.out.println("\nand the sum of all the numbers until the "+n+" is "+smtep5);
                        isOp=true;
                    }

                        while(!correct)
                        {
                            System.out.print("\nCalculate again?Y/N: ");
                            if(scanner.hasNext())
                            {

                                String reapp = scanner.next();
                                if(reapp.equalsIgnoreCase("y"))
                                {

                                    agg = false;
                                    correct =true;
                                
                                }else if(reapp.equalsIgnoreCase("n")){ agg=true;System.out.println("Thank you");correct=true;}

                            }else{System.out.println("Please on input Y or N"); correct=false;}

                        }
                        correct =false;

                }

            }

        }

    }
}
