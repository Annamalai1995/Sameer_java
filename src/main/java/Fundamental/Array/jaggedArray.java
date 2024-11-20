package Fundamental.Array;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
//        int [][]array={{1,2,3},{},{4,5,6,7,8},{1,2,3,4,5,6,7,8,9}};
//        for(int array1[]:array)
//        {
//            for(int array2:array1){
//                System.out.println(array2+"");
//            }
//        }
        String[][]pat_details= new String[2][];
        pat_details[0]=new String[4];  //floor
        pat_details[1]= new String[2];
        for(int floor=0;floor<pat_details.length;floor++)
        {
            for(int  room=0;room< pat_details[floor].length;room++ )
            {
                System.out.println("HOSIPTAL");
                Scanner scan = new Scanner(System.in);
                System.out.println("floor no:"+floor+""+(room)+"\t enter patient name");
                pat_details[floor][room]=scan.next();

            }
        }
        for(String patient1[]:pat_details)
        {
            for(String patient2:patient1)
            {
                System.out.println(patient2+"\t");

            }
            System.out.println();
        }
    }
}
