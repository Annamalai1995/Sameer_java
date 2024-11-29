package Fundamental.Thread;

public class Thread_sample extends  Thread {

    //Two types:
    //Extend Thread
    //Runnable Inferace


    //Special Method
    public void run()
    {
        System.out.println("Welcome to  Thread Concept");
    }
    public static void main(String[] args) {
        Thread_sample ts = new Thread_sample();
        ts.start();


    }
}
