package Fundamental.Collection;

import java.util.TreeMap;

public class Demo_Treemap {
    public static void main(String[] args) {
        TreeMap<String,MobilePhones> TTM=new TreeMap<String,MobilePhones>();
        MobilePhones mp=new MobilePhones("Iphone15",256,150000.0);
        MobilePhones mp1=new MobilePhones("vivoV30",256,450000.0);
        MobilePhones mp2=new MobilePhones("Oppo ",128,30000.0);
        MobilePhones mp3=new MobilePhones("Samsung",64,15000.0);
        TTM.put("Annamalai",mp);
        TTM.put("Sameer",mp1);
        TTM.put("Rajesh",mp2);
        TTM.put("Sathish",mp3);
        System.out.println("TREEMAP MOBILES IS:"+TTM);


    }

}
