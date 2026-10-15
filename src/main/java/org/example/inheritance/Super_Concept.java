// super() is a keyword in Java used to call the constructor of the parent class from the child class.
package org.example.inheritance;

import com.sun.jdi.PathSearchingVirtualMachine;

class AA{
    AA(){
        super();
        System.out.println("in A");
    }

    AA(int n){
        super();
        System.out.println("in A int");
    }
}

class BB extends AA{
    BB(){
        super();
        System.out.println("in B");
    }

    BB(int n){
        super(n);
        System.out.println("in B int");
    }


}

public class Super_Concept {
    public static void main(String[] args) {
        int n = 10;
        BB obj = new BB(n);

    }

}
