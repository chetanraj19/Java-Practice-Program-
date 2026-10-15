package org.example.polymorphims.Exception;

public class ExceptionProgram1 extends Exception {
    ExceptionProgram1(String msg) {
        super(msg);
    }

    public void show() {
        try {
            int[] myNumbers = {1, 2, 3};

            throw new ExceptionProgram1("lentght is short");

        } catch (Exception e) {
            System.out.println("Something Went Wrong " + e);
        } finally {
            System.out.println("the try and catch is finished");
        }
    }
}


