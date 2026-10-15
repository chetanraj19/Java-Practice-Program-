package org.example.Collectionss;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class ArrayListNew {
    public static void main(String[] args) {


//        List<String> name = new ArrayList<String>();
//        name.add("CHETAN");
//        name.add("Nikita");
//        name.add(1,"Raj");
//        name.add(2,"Gour");
////        name.clear();
//        name.addLast("Uikey");
//        name.addFirst("chetan");
//       // System.out.println(name.indexOf("uikey"));
//        System.out.println(name.contains("chetan"));
//        name.set(1,"Chetan");
//
//        name.remove(0);
//        System.out.println(name.size());
//        System.out.println(name);
//
//
//        System.out.println("...........................................");
////        for (int i =0; i<name.size();i++){
////            System.out.println(name.get(i));
////        }
//
//        for(String n : name){
//            System.out.println(n);
//        }

//        List<Integer> nums = new LinkedList<>();
          List<Integer> numss = Arrays.asList(1,2,4,5,6,7,8,9,10);
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//        nums.add(5);
//
//       System.out.println(numss);
//
//
//
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.print(n);
//                if(n <= numss.size())
//                System.out.print(", ");
//            }
//        };
//
//       numss.forEach(con);

        List<Integer> nums = Arrays.asList(8,2,6,7,5,9,3,1,4,10);

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 =s1.filter(n -> n%2 == 0);
       Stream<Integer> s3 =s2.map(n -> n*2);
 //      s1.forEach(n-> System.out.println(n));
        s3.forEach(n-> System.out.println(n));




    }
}
