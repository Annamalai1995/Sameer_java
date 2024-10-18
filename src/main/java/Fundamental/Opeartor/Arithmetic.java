package Fundamental.Opeartor;

public class Arithmetic {
    public void sum()
    {
        int data=100;
        int data1=200;
        int result;
        result=data+data1;
        System.out.println("The sum is:"+result);
        result=data-data1;
        System.out.println("The Substract:"+result);
        result=data*data1;
        System.out.println("The multiply:"+result);
        result=data/data1;
        System.out.println("The Division:"+result);
        result=data%data1;
        System.out.println("The Modulo Operator:"+result);
    }
    public static void main(String[] args) {
      Arithmetic ai= new Arithmetic();
      ai.sum();
    }
}
