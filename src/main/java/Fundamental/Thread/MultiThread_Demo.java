package Fundamental.Thread;

class bus
{
    void add() throws InterruptedException {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Welcome");
            Thread.sleep(5000);
        }
    }
}
class car
{
    void add() throws InterruptedException {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Car is the luxary vehicle ");
            Thread.sleep(2000);
        }
    }

}


public class MultiThread_Demo {
    public static void main(String[] args) throws InterruptedException {
        MultiThread_Demo me= new MultiThread_Demo();
        car c= new car();
        bus b = new bus();
        c.add();
        b.add();

    }
}
