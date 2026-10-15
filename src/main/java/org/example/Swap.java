package org.example;
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        char choose;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter list element : ");

        do{
            list.add(sc.nextInt());

            System.out.println("Do youo want to insert another element if yes , type -> Y or if you dont want to insert Type -> N : ");
             choose = (sc.next().charAt(0) == 'y' )? 'Y' : 'N';
        }while(choose == 'y' || choose == 'Y');


        for (int element : list){
            System.out.println(element);
        }

    }
}
