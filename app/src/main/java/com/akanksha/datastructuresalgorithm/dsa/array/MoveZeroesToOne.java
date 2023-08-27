package com.akanksha.datastructuresalgorithm.dsa.array;

import java.util.ArrayList;

public class MoveZeroesToOne {

    public void moveZeroes(int[] arr) {

        // int count = 0;
        //Check if array is non zero, if yes swap it with current index and then increment count
        // for (int i = 0; i < arr.length; i++)
        //     if (arr[i] != 0)
        //         arr[count++] = arr[i];
        //Until now, all the non zero elements have reached on front, now by below code we see
        //how many elements need to be filled with zero using count variable, first we fill with zero
        //then we increment count in 18th line
        // while (count < arr.length)
        //     arr[count++] = 0;

        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        // Brute Force Solution
        for(int i = 0; i <n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        int nz = temp.size();
        for(int i = 0; i < nz; i++){
            arr[i] = temp.get(i);
        }
        for(int i = nz; i < n; i++){
            arr[i] = 0;

        }

    }
}
