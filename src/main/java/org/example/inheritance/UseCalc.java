package org.example.inheritance;

public class UseCalc {
    public static void main(String[] args) {
//        Calc c1= new Calc();
//        AdvCalc c2 = new AdvCalc();

        VACalc c1 = new VACalc();

//        int r1 = c1.add(10,20);
//        int r2 = c1.sub(20,10);

        int r3 = c1.add(10,20);
        int r4 = c1.sub(20,10);
        int r5 = c1.multi(10,20);
        int r6 = c1.divide(10,20);
        double r7 =  c1.power(2,2);





//        System.out.println(r1);
//        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println((int)r7);
    }
}
