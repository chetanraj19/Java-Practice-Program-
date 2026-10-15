package org.example.Interface;

interface Program1{
    int age = 23;
    String area = "Khasrod";
    void config();
    void show();
}

interface Second2{
    void run();
}

class Use implements Program1,Second2{
    public void show(){
        System.out.println("i am in show");
    }
    public void config(){
        System.out.println("i am config");
    }

    public void run(){
        System.out.println("i am running");
    }
}

