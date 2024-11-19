package Fundamental.Array;

import java.util.Scanner;

public class Readarray {
    public void passingarray(float percentage[])
    {
        percentage[4]=0.0f;
        System.out.println(percentage[0]);
        Scanner scan= new Scanner(System.in);
        System.out.println("which position of percentage of value");
        int position=scan.nextInt();
        System.out.println(position+"position value:"+percentage[position]);

    }
    public static void main(String[] args) {
        Readarray rd= new Readarray();
        float cgpa[]={7.8f,8.8f,5.9f,4.5f,7.6f,6.4f};
        rd.passingarray(cgpa);
    }
}
