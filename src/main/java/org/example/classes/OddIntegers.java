package org.example.classes;

import java.util.ArrayList;
import java.util.List;

public class OddIntegers {

    public static List <Integer> getOddNumbers (int n){
        List<Integer> oddList= new ArrayList<>();
        for(int i=1; i<n; i++){
            if(i % 2 !=0){
                oddList.add(i);
            }
        } return oddList;

    }
}
