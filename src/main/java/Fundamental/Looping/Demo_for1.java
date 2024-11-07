package Fundamental.Looping;

import java.util.Scanner;

public class Demo_for1 {
    public static void main(String[] args) {
        int quickcomercountr=0;
        int latecomercountr=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to cognizant Technology Solution");
        int staffcount=5;
        for(;staffcount>=1;)
        {
            System.out.println("Staff no:"+staffcount);
            System.out.println("please enter login time");
            float time=scan.nextFloat();
            if(time>9.15)
            {
                System.out.println("your are later comer");
                latecomercountr++;

            } else if ((time>8.00)&&(time<=9.15)) {
                System.out.println("you are quickcomer");
            }
            else {
                System.out.println("Correct time to come");
            }

            staffcount--;


        }
        System.out.println("today quick comer"+quickcomercountr);
        System.out.println("late comer staff count:"+latecomercountr);

    }
}
