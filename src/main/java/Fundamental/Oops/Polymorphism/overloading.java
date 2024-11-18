package Fundamental.Oops.Polymorphism;

public class overloading {
    public void over( String cosmo,String alpha)
    {
        if(cosmo == alpha)
        {
            System.out.println("Equal the values are same");
        }
        else {
            System.out.println("Not equal");
        }

    }
    public void over(int value ,int  value1)
    {
        int result=value*value1;
        System.out.println("The result:"+result);
    }
    public void over(float weight)
    {
        double weight1=weight;
        System.out.println("Weight is:"+weight1);
    }

    public static void main(String[] args) {
        overloading oo= new overloading();
        oo.over("Annamali","Annamalai");
        oo.over(1500,6500);
        oo.over(70.58f);
    }
}
