package Fundamental.Thread;
class Demo_bus extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("VOlvo is the luxary bus in india but very costly");
            try
            {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Demo_car extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Benz car is costlier then BMW");
            try
            {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo_multithread {
    public static void main(String[] args) throws InterruptedException {
        Demo_bus db= new Demo_bus();
        Demo_car dc = new Demo_car();
        db.start();
        dc.start();
        if(db.isAlive())
        {
            System.out.println("Exceuted the thread");
        }
        db.join();
        dc.join();

        System.out.println("Finally The exit Thread");

    }
}
