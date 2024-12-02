package Fundamental.Collection;

import java.util.ArrayList;
import java.util.Vector;

public class Arraylist {
    public static void main(String[] args) {
        //ArrayList<integer>li=new Arraylist<integer> Non Genric
        ArrayList li= new ArrayList();
        li.add("Sameer");
        li.add("KPR");
        li.add(9.4);
        li.add('M');
       // System.out.println("ArrayList:"+li);
        Vector vv= new Vector();
        vv.addAll(li);
        vv.add("Annamalai");
        vv.add("Karpagam");
        System.out.println("ArrayLIst"+li);
        System.out.println("Vector List:"+vv);
        vv.remove("Annamalai");
        System.out.println("Remove Array or vector:"+vv);
        vv.removeAll(li);
        System.out.println("Remove:"+vv);
        vv.retainAll(li);
        System.out.println("Retain:"+vv);
    }
}
