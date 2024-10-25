package Fundamental.MethodTypes;

public class Demo_methods {
    //with return type and without arguments
    public void noargs()
    {
        int worker_count=15;
        String name="sameer";
        System.out.println("Worker Count:"+worker_count+""+"Name is"+name);
       // System.out.println("Name is:"+name);
    }
    //witn returntype without aruguments
    public String setname()
    {
        String Office_name="Zealous tech corp";
       System.out.println("OFFICE_NAME :"+Office_name);

        return Office_name;
    }
    //with return type with arguments
    public void passing(float salary,int age)
    {
        System.out.println("Salary:"+salary);
        System.out.println("Age is:"+age);

    }
    public static void main(String[] args) {
        Demo_methods dm= new Demo_methods();
        dm.noargs();
        dm.setname();
        dm.passing(15.5f,28);


    }
}
