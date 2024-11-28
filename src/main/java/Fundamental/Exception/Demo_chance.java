package Fundamental.Exception;

import java.util.Scanner;

public class Demo_chance {
    static Scanner scan = new Scanner(System.in);
    public static void chance_unlimit(String content)
    {
        try
        {
            System.out.println("Enter the starting string");
            int start=scan.nextInt();
            System.out.println("Enetr ending string");
            int end=scan.nextInt();
            System.out.println("My values iS:"+content );

        }catch (StringIndexOutOfBoundsException se)
        {
            System.out.println(se);
            System.out.println("Starting value is  0 ending value"+content.length()+"\n please enter only between numbers");
            chance_unlimit(content);
        }
    }
    public static void limit(String content ,int chance)
    {
        try
        {
            System.out.println("Enter the starting string");
            int start= scan.nextInt();
            System.out.println("Enter teh ending string");
            int end =scan.nextInt();
            System.out.println("My values:"+content.substring(start,end));

        }catch (StringIndexOutOfBoundsException se)

        {
            System.out.println(se);
            System.out.println("Starting value is  0 ending value"+content.length()+"\n please enter only between numbers");
            if(chance < 3)
            {
                chance++;
                limit(content,chance);
            }
            else {
                System.out.println("chance over");
            }


        }

    }
    public static void main(String[] args) {
        String data="Nothing more than happiness,life is so beautiful";
        limit(data,1);


    }
}
