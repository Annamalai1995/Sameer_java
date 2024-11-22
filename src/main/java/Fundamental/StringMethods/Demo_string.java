package Fundamental.StringMethods;

public class Demo_string {
    public static void main(String[] args) {
        //literal
        String employname="Annamalai";
        char[] emp_desc={'j','a','v','a'};
     //   System.out.println(employname);
       // System.out.println(emp_desc);
        //NON-literal
        String employeeposition=new String(emp_desc);
        String emp="developer";
        //concat
        System.out.println(employeeposition.concat(emp));
        //charAt()
        System.out.println(employname.charAt(2));
        //equal and equalignorecase()
        System.out.println("Annamalai".equalsIgnoreCase("annamalai"));
        System.out.println("Annamalai".equals(employname));
        //compareto and comparetoignore()
        System.out.println("Annamalai".compareTo(employname));
        System.out.println("Annnnamalai".compareToIgnoreCase(employname));
        //substring()
        String name="Annamalai";
        System.out.println(name.substring((5)));
        System.out.println(name.substring(3,5));
        //touppercase and tolowercase()
        System.out.println(employeeposition.toLowerCase());
        System.out.println(employeeposition.toUpperCase());
        //Replace
        String mycontent="String is basically sequences of character";
        mycontent=mycontent.replace("s","a");
        System.out.println(mycontent);
        //endwith and startwith
        System.out.println(employeeposition.startsWith("java"));
        System.out.println(employeeposition.endsWith("a"));

        //trim()

        String myword="     i am annamalai";
        System.out.println(myword);
        System.out.println(myword.trim());

    }
}
