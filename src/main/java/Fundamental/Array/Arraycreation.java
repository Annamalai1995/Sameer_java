package Fundamental.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraycreation {
    public static void main(String[] args) {
        //datatype arrayname[];
        String ipl[]={"Csk","Mi","Rcb","Lsg","Gt","Kkr"};
        //System.out.println("Array values:"+ipl);
        //TOSTRING
        System.out.println(Arrays.toString(ipl));
        System.out.println("length:"+ipl.length);
        //LOOP using print the array
        for(int index=0;index<ipl.length;index++)
        {
            System.out.println(ipl[index]);
        }


        //FOR EACH LOOP
        for(String  newipl:ipl)
        {
            System.out.println(newipl);
        }
        char[]initial=new char[5];
        for(int i=0;i<initial.length;i++)
        {
            Scanner scan= new Scanner(System.in);
            System.out.println("Please enter any one alphabet letter");
            char initial1=scan.next().charAt(0);
            initial[i]=initial1;



        }
        System.out.println(Arrays.toString(initial));



    }

}
