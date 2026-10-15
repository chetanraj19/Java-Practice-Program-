package org.example.polymorphims.Exception;

public class ArithmeticE{
   public void devide(int a , int b){

        try{
            int result = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("can not devided by zero");
            System.out.println(e);
        }
    }
}
