package Fundamental.Oops.Polymorphism;
class over
{
    public void district(String dist1,String dist2)
    {
        if((dist1==dist2)||(dist1==dist2))
        {
            System.out.println("The condtion true");
        }
        else {
            System.out.println("False condtion");
        }
    }
}
class over1
{
    public void district(String dist1,String dist2)
    {
        if(dist1=="Tamilnadu")
        {
            System.out.println("This is my district");
        }
        else {
            System.out.println("This is not my district");
        }
    }
}

public class Overriding {
    public static void main(String[] args) {
        over1 oo= new over1();
        oo.district("Salem","Salem");
        over oo1= new over();
        oo1.district("salem","salem");
    }

}
