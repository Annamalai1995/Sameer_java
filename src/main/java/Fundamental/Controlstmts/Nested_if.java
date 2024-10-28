package Fundamental.Controlstmts;

import Fundamental.Opeartor.scanner;

import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Tell us chemistry mark");
        int chem_mark=scan.nextInt();
        if(chem_mark>=50)     //outer if
        {
            System.out.println("your are selected Engineering courses");
            Scanner scan1 = new Scanner(System.in);
            int biology_mark = scan1.nextInt();
            if (chem_mark >= 50 && biology_mark >= 75) {   //inner if
                System.out.println("Your selected DOCtor");
                System.out.println("ALl the best");
            } else {
                System.out.println("Your are not eligble doctor");

            }
        }
        else
            {
                System.out.println("Your not eligible for any courses");
            }



        }
}

