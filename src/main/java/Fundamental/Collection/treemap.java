package Fundamental.Collection;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> Tm= new TreeMap<String,Integer>();
        Tm.put("Sameer",101);
        Tm.put("Annamalai",102);
        Tm.put("Sathish",103);
        Tm.put("Rajesh",104);
        Tm.put("Jayapraksh",105);
        System.out.println("TREEMAP VALUES"+Tm);
        System.out.println(Tm.containsValue(104));
        System.out.println(Tm.containsKey("Raja"));
        System.out.println(Tm.get("Sameer"));

    }
}
