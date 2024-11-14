package Fundamental.Oops;

public class classandobject {
    public void human()   // Methods
    {
        String nose="single nose";
        String eyes="two eyes";
        String leg="2 legs";
        System.out.println("NOSE IS :"+nose);
        System.out.println("EYES IS :"+eyes);
        System.out.println("LEG IS:"+leg);

    }
    public static void main(String[] args) {
        classandobject obj = new classandobject();
        obj.human();


    }
}
