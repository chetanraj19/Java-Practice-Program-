package org.example.Collectionss;
import java.util.Random;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {

            list.add(random.nextInt(10));
        }

        System.out.println(list);


        for (int i : list) {
            sum += i;
        }

        list.remove(10);
        System.out.println();

        System.out.println("the sum of all list integer value is : "+sum);

        System.out.println(list.size());


    }
}
