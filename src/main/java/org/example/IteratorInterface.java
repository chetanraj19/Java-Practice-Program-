package org.example;
import java.util.*;
public class IteratorInterface {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements do you want to insert : ");
        int n = sc.nextInt();
        for (int i =1 ; i <= n ; i++){
            System.out.print("Enter Element : "+ i + " : ");
            list.add(sc.nextInt());
            System.out.println();
        }
        Iterator<Integer> it = list.iterator();

            System.out.print("Elements : ");
//


        while(it.hasNext()){
            System.out.print(it.next());



            System.out.print(" ");
        }
        for (int i :  list){
            System.out.print(i+" ");
            }
    }
}
