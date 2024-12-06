package Fundamental.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) throws IOException {
        File f=new File("F:\\sameer.txt");
       // f.createNewFile();
        //System.out.println(f.getName()+"File created");

        FileOutputStream fo= new FileOutputStream(f);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text ");
        String writefile=scan.nextLine();
        fo.write(writefile.getBytes());
        System.out.println(f.getName()+"write files");






    }
}
