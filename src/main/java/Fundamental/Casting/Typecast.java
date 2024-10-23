package Fundamental.Casting;

public class Typecast {
    public static void main(String[] args) {
        char bloody='b';
        int sweet=450;
        int value=(int)bloody;
        System.out.println("Th bloody value:"+value);


        //widing small to large
        float res=(float)sweet;
        System.out.println("INT Value convert into float:"+res);


        //narrowing large to small

        double salary=70.5;
        int result=(int)salary;
        System.out.println("Double result:"+result);


    }
}
