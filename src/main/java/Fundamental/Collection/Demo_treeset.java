package Fundamental.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo_treeset {
    public static void main(String[] args) {
        TreeSet<String> tt= new TreeSet<String>();
        tt.add("salem");
        tt.add("chennai");
        tt.add("Bengalur");
        tt.add("coimbatore");
        System.out.println("TREESET:"+tt);
        HashSet<String> ht= new HashSet<String>();
        ht.addAll(tt);
        Iterator<String> ie= ht.iterator();
        while (ie.hasNext())
        {
            System.out.println(ie.next()+"Hash set Values");
        }
    }
}
