package Fundamental.Controlstmts;

import java.util.Scanner;

public class Demo_switch {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("tell us your mobile Brands");
        String brand=scan.next();
        switch (brand)
        {
            case "vivo":
                System.out.println("best branded mobile in budget friendly");
                break;
            case "Apple":
                System.out.println("Its a costly mobile");
                break;
            case "Oppo":
                System.out.println("Oppo is the very budget friendly mobile");
                break;
            case "Pixel":
                System.out.println("Google pixels");
                break;
            default:
                System.out.println("Not valid");
        }
    }
}
