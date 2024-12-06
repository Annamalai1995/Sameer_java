package Fundamental.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class Securerite {
    public static void main(String[] args) throws IOException {
        File ff=new File("F:\\Sameer1.txt");
        FileOutputStream fo = new FileOutputStream(ff);
        DeflaterOutputStream dos= new DeflaterOutputStream(fo);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text");
        String value =scan.nextLine();
        dos.write(value.getBytes());
        System.out.println(ff.getName()+"writefile succesfully");
        dos.close();
        fo.close();
    }
}
