package Fundamental.Oops.Abstraction;

public class vehicle1 extends  vehicle {


    @Override
    public void benz() {
        System.out.println("benz car is costly ");
    }

    @Override
    public void bike() {
        System.out.println("its a low cost for middle class peoples");

    }

    public static void main(String[] args) {
   vehicle1 vv  = new vehicle1();
   vv.benz();
   vv.car();
   vv.bike();
    }
}
