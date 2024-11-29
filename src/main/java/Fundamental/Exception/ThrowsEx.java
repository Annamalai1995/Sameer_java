package Fundamental.Exception;


public class ThrowsEx {
    public void analysis()
    {
        try
        {
            throw  new NullPointerException();

        }catch (NullPointerException ne)
        {
            System.out.println("try block execute");
            throw  ne;

        }

    }

    public static void main(String[] args) {
        ThrowsEx tex= new ThrowsEx();
        try
        {
            tex.analysis();

        }catch (NullPointerException nee)
        {
            System.out.println("main method executed");
        }finally {
            System.out.println("Thank you ");
        }
    }
}
