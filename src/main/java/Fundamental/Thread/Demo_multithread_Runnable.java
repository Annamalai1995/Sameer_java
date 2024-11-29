package Fundamental.Thread;
class student implements  Runnable
{

    @Override
    public void run() {
        System.out.println("Welcome to Muthayammal college");
    }

}
class college extends  Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Departments of UG courses");
            try
            {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo_multithread_Runnable {
    public static void main(String[] args) {
        Runnable rc= new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=4;i++)
                {
                    System.out.println("welcome");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }


            }
        };
        college c=new college();
        Thread t= new Thread(c);
        t.setName("Sameer");
        System.out.println(t.getName());
        t.setPriority(1);
        System.out.println(t.getPriority());
        t.start();
        c.start();
        student ss= new student();
        rc.run();
        ss.run();
    }
}

