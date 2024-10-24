package Fundamental.Opeartor;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
//        System.out.println("Enter the new value ONE");
//        int data=scan.nextInt();
//        System.out.println("Enter the new value SECOND ");
//        int data1=scan.nextInt();
//        int output=data+data1;
//        System.out.println("Result is :"+output);
        System.out.println("BIO DETAILS");
        System.out.println("Enter the Name:");
        String name=scan.nextLine();
        System.out.println("The name IS:"+name);
        System.out.println("Enter tHe college  Name");
        String cname=scan.next();
        System.out.println("My college is:"+cname);
        System.out.println("Enter the CGPA");
        float cgpa=scan.nextFloat();
        System.out.println("my CGPA IS:"+cgpa);
        System.out.println("Enter Location:");
        String location=scan.next();
        System.out.println("My location is:"+location);
        System.out.println(" Enter Department");
        String dept=scan.next();
        System.out.println("DEPARTMENT:"+dept);


    }
}
