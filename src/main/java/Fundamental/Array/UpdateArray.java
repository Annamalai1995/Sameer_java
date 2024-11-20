package Fundamental.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        String[] office_details={"Annamalai","sathish","Deepika","priya","Gowthami"};
        System.out.println(office_details.length);
//        office_details[3]="vidhya";
//  System.out.println(Arrays.toString(office_details));
        UpdateArray ua = new UpdateArray();
        System.out.println("Before update values:"+Arrays.toString(office_details));
        Scanner scan = new Scanner(System.in);
        System.out.println("Which position you want to update "+(office_details.length-1));
        int index=scan.nextInt();
        System.out.println("you are selected index"+index+"position values:"+office_details[index]);
        System.out.println("Please enter your new values");
        String newname=scan.next();
        office_details[index]=newname;
        System.out.println("After update value is:"+Arrays.toString(office_details));





    }
}
