package Fundamental.Controlstmts;

import java.util.Scanner;

public class Demo_if {
    public static void main(String[] args) {
        //IF,else,ELSE..IF
        Scanner scan= new Scanner(System.in);
        System.out.println("what is your company name");
        String company_name=scan.next();
        if(company_name.equalsIgnoreCase("Zealous"))
        {
            System.out.println("your are eligible for IT working");

        }
        else if (company_name.equalsIgnoreCase("Capgemini")){
            System.out.println("your are eligble for NOt IT work");

        }
        else if(company_name.startsWith("Info"))
        {
            System.out.println("your are working tech support");
        }
        else {
            System.out.println("Not valid");
        }
    }
}
