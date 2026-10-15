package org.example.polymorphims;

public class BUGS {
    public void showTheDataWhichBelongToThisClass(){
        System.out.println("in A show");
    }

}

class B extends BUGS{

    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}
