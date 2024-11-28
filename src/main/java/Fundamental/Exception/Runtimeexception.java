package Fundamental.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runtimeexception {
    public static void main(String[] args) {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value");
            int a=scan.nextInt();
            System.out.println("enter the values");
            int b= scan.nextInt();

            System.out.println(a/b);
        }catch (ArithmeticException ae)
        {
            System.out.println("please enter the value is zero");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the value");
            int a=scan.nextInt();
            System.out.println("enter the values");
            int b= scan.nextInt();

            System.out.println(a/b);
        }catch (InputMismatchException ie)
        {
            try
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the value");
                int a=scan.nextInt();
                System.out.println("enter the values");
                int b= scan.nextInt();

                System.out.println(a/b);
            }catch (ArithmeticException e)
            {
                System.out.println(e);
            }



        }finally {
            System.out.println("Thanks for giving opportunity");
        }


    }

}
