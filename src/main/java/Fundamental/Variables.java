package Fundamental;

public class Variables {
    static  String Department="BE ECE";      //static variable
    double cgpa=8.55;       //Global varibale
    int percentatge=90;

    public void sameer()      //Local Varibles
    {
        String collegename="KPR COLLEGE";
        String Location="Coimbatore";
        System.out.println("College name:"+collegename);
        System.out.println("Location:"+Location);
        System.out.println("CGPA:"+cgpa);
        System.out.println("Percentage:"+percentatge);

    }
    public static void main(String[] args) {
        String name="Sameer";    //instance variable
        int age=22;
        System.out.println("Name IS:"+name);
        System.out.println("Age is:"+age);
        //create a object
        //classname objectname=new classname();
        Variables aa= new Variables();
        //method call
        //objectname.methodname()
        aa.sameer();
        System.out.println("Department :"+Department);

    }
}
