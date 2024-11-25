package Fundamental.Constructor;

public class Parameter_constrcutor {
    String office_name;
    String place;
    int id;



    public void parameter()
    {
        System.out.println("OFFICE_NAME:"+office_name);
        System.out.println("PLACE IS:"+place);
        System.out.println("Employe_id"+id);
    }

    public Parameter_constrcutor(String office_name, String place, int id) {
        this.office_name = office_name;
        this.place = place;
        this.id = id;
    }

    public static void main(String[] args) {
        Parameter_constrcutor pp= new Parameter_constrcutor("cognizant","Chennai",501);
pp.parameter();
    }

}
