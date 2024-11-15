package Fundamental.Oops.Multiple;

public class Connect implements  Bike,BUS,car {
    @Override
    public void volvo() {
        System.out.println("It is a luxary buses");

    }

    @Override
    public void jawa() {
        System.out.println("Jawa bike is the fav one");
    }

    @Override
    public void BENZ() {
        System.out.println("Its a costly car and luxary segment");

    }

    public static void main(String[] args) {
        Connect cc= new Connect();
        cc.BENZ();
        cc.volvo();
        cc.jawa();

    }
}
