package Fundamental.Looping;

import java.util.Scanner;

public class Demo_while1 {
    public static void main(String[] args) {
        int available=20;
        int topayable;
        int quantity;
        int payamount;
        while (available>0)
        {
            Scanner scan= new Scanner(System.in);
            System.out.println("how many iphones you want to buy");
            quantity=scan.nextInt();
            if(quantity>available)
            {
                System.out.println("Only"+available+"Available");
            }
            else {
                topayable=quantity*18000;
                System.out.println("You pay to"+topayable);
                System.out.println("enter the amount");
                payamount= scan.nextInt();
                if(topayable<=payamount)
                {
                    System.out.println("you bought a iphones"+quantity);

                }
                else {
                    System.out.println("insuffcient amount");

                }
                available-=quantity;//20-4=16
                System.out.println("currently avaiable quantity:"+available);
            }
        }
    }
}
