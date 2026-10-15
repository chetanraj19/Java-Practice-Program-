package org.example;

class C1 extends Object {

   public C1(){
       System.out.println("i am in parent constructor");
    }

    public C1(String Name){
        System.out.println("in the perent : the name of the person is :"+Name);
    }
}


class C2 extends C1{
    public C2(){
        System.out.println("i am in child constructor");
    }

    public C2(String Name){
        super(Name);
        System.out.println("in the child  : the name of the person is :"+Name);
    }
}


public class Demo{
    public static void main(String[] args) {
        C2 obj = new C2("Chetan");
    }
}
