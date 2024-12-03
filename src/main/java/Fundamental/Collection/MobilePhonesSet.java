package Fundamental.Collection;

import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.util.Iterator;
import java.util.TreeSet;

class MobilePhones implements  Comparable<MobilePhones>
{
    String mobilename;
    Integer ram;
    Double price;
    public MobilePhones(String mobilename,Integer ram,Double price)
    {
        super();
        this.mobilename=mobilename;
        this.ram=ram;
        this.price=price;
        
    }
    public String toString()
    {
        return "MobilePhones[mobilename="+mobilename+"Ram="+ram+"PRICE="+price+"]";
    }
    
    @Override
    public int compareTo(MobilePhones o) {
        return o.price.compareTo(this.price);
    }

}
public class MobilePhonesSet {
    public static void main(String[] args) {
        TreeSet<MobilePhones> Sathya= new TreeSet<MobilePhones>();
        Sathya.add(new MobilePhones("Iphone13",128,79000.0));
        Sathya.add(new MobilePhones("Realme10",256,35000.0));
        Sathya.add(new MobilePhones("vivoV20",256,25500.0));
        Sathya.add(new MobilePhones("Oneplus10R",25,45000.0));
        MobilePhones mp=new MobilePhones("Oppo Reno",128,30000.0);
        Sathya.add(mp);
     //   System.out.println("MOBILE PHONES:"+Sathya);
        Iterator ie=Sathya.iterator();
        while (ie.hasNext())
        {
            System.out.println("Mobile Phones"+ie.next());
        }

    }
}
