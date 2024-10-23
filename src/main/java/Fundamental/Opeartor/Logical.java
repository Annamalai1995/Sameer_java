package Fundamental.Opeartor;

public class Logical {
    public static void main(String[] args) {
        //And  -- &&   or  || not-!
        String coolingplace="ooty";
        String coolingplace1="ooty";
        String cooling="manali";
        System.out.println((coolingplace==coolingplace1) && (cooling==coolingplace1));  //AND
        System.out.println((cooling==coolingplace1)||(cooling==coolingplace)); //OR
        //NOT GATE
        int alpha=15;
        int gamma=10;
        System.out.println(!(alpha==gamma));




    }
}
