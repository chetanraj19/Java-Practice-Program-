package org.example.Interface;

abstract class Computer{
    public abstract void code();
}

class laptop extends Computer{
    public void code(){
        System.out.println("code , compile , run");
    }
}

class desktop extends Computer{
    public void code(){
        System.out.println("code , compile , run : Faster");
    }
}


class developer{
    public void devApp(Computer obj){
        obj.code();
    }
}
