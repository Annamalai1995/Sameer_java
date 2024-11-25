package Fundamental.StringMethods;

public class Bufferclass {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("zealous");
        sb.append("Techcorp");
        System.out.println(sb);
        sb.insert(0,"salem");
        System.out.println(sb);
        sb.replace(1,3,"HAi");
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
