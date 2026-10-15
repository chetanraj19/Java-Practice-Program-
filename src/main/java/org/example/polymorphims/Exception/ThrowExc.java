package org.example.polymorphims.Exception;

class MyException extends Exception{
    MyException(String string){
        super(string);
    }
}

public class ThrowExc{
   int x =0;

   void calculate(int y) {

       try {

           if (y == 0) {
//               throw new ArithmeticException("the value of a is Zero , please try again with another value");

               throw new MyException("i dont want to print 0");
           }
           x = 20 / y;

       } catch (MyException e) {
           System.out.println(e);
       }
   }
}
