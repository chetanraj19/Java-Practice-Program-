package org.example.ArraysPractices;

public class LowestAge {
    int[] age ;
     public LowestAge(int[] arr){
         this.age = arr;
     }
    public int lowestAge(){
        int lage = age[0];
        for (int i = 1; i<age.length; i++){

            if(age[i]<= lage){
                lage = age[i];
            }
        }

        return lage;
    }

    public int highestAge(){
        int gage = age[0];
        for (int i = 1; i<age.length; i++){

            if(age[i]>= gage){
                gage = age[i];
            }
        }

        return gage;
    }
}
