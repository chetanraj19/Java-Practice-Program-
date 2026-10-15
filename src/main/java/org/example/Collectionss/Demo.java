package org.example.Collectionss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {


        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(7);
        nums.add(9);
        nums.add(10);

        for(int n : nums) {
            System.out.println(n);
        }

        System.out.println(nums);

    }
}