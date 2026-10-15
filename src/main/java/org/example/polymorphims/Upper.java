package org.example.polymorphims;

 class Upper {
    public void show(){
        System.out.println("i am in upper class");
    }

    static class Inner{
        public void show(){
            System.out.println("i am in inner class");
        }
    }
}
