package Fundamental.Oops;

public class Enapsulation {
    public int collge_id;
    public String name;
    public String cname;
    public double cgpa;
    public String location;

    public int getCollge_id() {
        return collge_id;
    }

    public void setCollge_id(int collge_id) {
        this.collge_id = collge_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        Enapsulation en= new Enapsulation();
        en.setCollge_id(501);
        en.setName("Annamalai");
        en.setCname("Karpagam");
        en.setCgpa(8.1);
        en.setLocation("Coimbatore");
        System.out.println("My collegeid:"+en.getCollge_id()+""+"Name isn :"+en.getName()+""+"COllege  name is"+en.getCname()+""+"CGPA IS"+en.getCgpa()+""+"Location:"+en.getLocation());

    }
}
