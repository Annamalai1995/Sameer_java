package Fundamental.Collection;

import java.util.LinkedList;
import java.util.Stack;

public class Demo_stack_linked_list {
    public static void main(String[] args) {
        //Stack Last in first out
        //push,pop,empty,peek,search
        Stack ss= new Stack(); //generic
        Stack<Integer> ss1= new Stack<Integer>(); //Non Genric
        ss.push("Annamalai");
        ss.push("priya");
        ss.push("sathish");
        ss.push('M');
        ss.push(6.35);
        System.out.println("Stack List:"+ss);
        ss.pop();
        System.out.println("POP ELEMENT:"+ss);
        if(ss1.empty()==true)
        {
            System.out.println("Stack empty");
        }
        else {
            System.out.println("Stack Nt empty");
        }
        System.out.println(ss.search("Annamalai"));
        System.out.println(ss.peek());

        LinkedList<String>lin= new LinkedList<String>();
        lin.add("ANnamalai");
        lin.add("sameer");
        lin.add("kumar");
        lin.add("4562");
        System.out.println("LINKED LIST:"+lin);

    }
}
