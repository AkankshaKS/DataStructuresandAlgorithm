package com.akanksha.datastructuresalgorithm.dsa.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnionOfTwoSortedArray {

    //Brute Force
    public static List< Integer > sortedArray(int []a, int []b) {

        //using ordrered set approach
        /*HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            s.add(a[i]);
        }
        for(int i = 0; i < b.length; i++){
            s.add(b[i]);
        }
        List<Integer> list1=new ArrayList<>(s);
        return list1;*/

        // using two pointer approach where compare i and j if if i <= j then insert it in list
        //if already inserted then ignore otheriwse add, repeat with same with j pointer.
        int n1 = a.length;
        int n2 = b.length;
        int i = 0,j = 0;
        ArrayList<Integer> list= new ArrayList<>();

        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(list.size() == 0 || list.get(list.size() -1) != a[i]){
                    list.add(a[i]);
                }
                i++;
            } else{
                if(list.size() == 0 || list.get(list.size() -1) != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        //this while is for the remaining elements left within any array
        while(i < n1){
            if(list.get(list.size() -1) != a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j < n2){
            if(list.get(list.size() -1) != b[j]){
                list.add(b[j]);
            }
            j++;
        }
        //TC: O(N1+N2)
        return list;
    }
}
