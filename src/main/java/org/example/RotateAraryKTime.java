package org.example;

import java.util.*;

public class RotateAraryKTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();

        List<Integer> li = new ArrayList<>();
        System.out.println("Enter "+n+" Elements only");
        for (int i = 1; i <=n ; i++) {

            li.add(sc.nextInt());

        }

        Collections.rotate(li,2);

        System.out.println("List after rotating right by 1 position : ");
        System.out.println(li);

    }
    }

