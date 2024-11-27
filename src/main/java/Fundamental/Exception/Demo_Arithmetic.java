package Fundamental.Exception;

public class Demo_Arithmetic {
    public static void main(String[] args) {
//        int value=100;
//        int value1=0;
//        int res=value/value1;
//        System.out.println(res);
        try
        {
            int value=100;
            int value1=0;
            int res=value/value1;
            System.out.println("Result:"+res);
        }catch(ArithmeticException e){

            System.out.println(e);


        }
        System.out.println("Sameer");
        int a=10;
        int b=40;
        int c=a+b;
        System.out.println(c);


    }
}
