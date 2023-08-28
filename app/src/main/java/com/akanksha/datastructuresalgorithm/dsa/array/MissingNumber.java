package com.akanksha.datastructuresalgorithm.dsa.array;

public class MissingNumber {

    public int missingNumber(int[] arr){

        int n = arr.length;
        int x = n*(n+1)/2;
        int z = 0;

        for(int i: arr){
            z = x-arr[i];
        }

        return z;
    }
}
