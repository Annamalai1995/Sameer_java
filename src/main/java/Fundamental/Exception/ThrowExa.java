package Fundamental.Exception;

public class ThrowExa {
    public  void eligible(int age)
    {
        if(age>20)
        {
            throw  new ArithmeticException("yor are not eligible");
        }
        else {
            System.out.println("you are eligible");
        }
    }

    public static void main(String[] args) {
        ThrowExa ex= new ThrowExa();
        ex.eligible(21);

    }
}
