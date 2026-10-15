package org.example.polymorphims;

abstract class Anonymous {
    public abstract void show();
    public void hear(){
        System.out.println("i can hear you!");
    }
}

class Harman extends Anonymous{
    public void show(){
        System.out.println("i can see you~~");
    }
}
