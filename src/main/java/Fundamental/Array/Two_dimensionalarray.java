package Fundamental.Array;

import java.util.Arrays;

public class Two_dimensionalarray {
    public static void main(String[] args) {
        //syntax : datatype[][]arrayname;

        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(matrix));
//    3*3 matrix
        for( int row=0;row<  3;row++)
        {
            for(int column=0;column<3;column++)
            {
                System.out.println(matrix[row][column]);

            }
    }
    }




}
