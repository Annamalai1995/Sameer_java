package Fundamental.Constructor;

public class Default_constructor {


    public void cust_details()
    {
        String company_name="DMART";
        String place="salem";
        System.out.println("Company Name:"+company_name);
        System.out.println("Place is:"+place);
    }

    public Default_constructor()
    {
        System.out.println("welcome to madikeri at coorg");
    }
    public static void main(String[] args) {
        Default_constructor dc= new Default_constructor();
        dc.cust_details();

    }
}
