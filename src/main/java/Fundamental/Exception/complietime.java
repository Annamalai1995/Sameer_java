package Fundamental.Exception;

import java.io.IOException;

public class complietime {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime rt= Runtime.getRuntime();
         Process pro;
         pro=rt.exec("notepad");
         Thread.sleep(5000);
         pro=rt.exec("mspaint");




    }
}
