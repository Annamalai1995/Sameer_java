package Fundamental.Oops;
class supermarket
{
    public void things()
    {
        System.out.println("Bakery product");
        System.out.println("Fragrance");
        System.out.println("medical things");
    }


}
class Dmart extends supermarket
{
    public void bakery()
    {
        String cakes="White forest";
        System.out.println("The cake is :"+cakes);
    }
}
class Reliance extends supermarket
{
    public  void fragrances()
    {
        int quantity=10;
        String name="Fogg Black";
        double price=255.5;
        System.out.println("Fragrances Name:"+name);
        System.out.println("Price is :"+price);
        System.out.println("Qunatity:"+quantity);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        supermarket sm= new supermarket();
        sm.things();
        Reliance rr= new Reliance();
        rr.fragrances();
        rr.things();
        Dmart dd= new Dmart();
        dd.bakery();
    }
}
