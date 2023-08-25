package com.akanksha.datastructuresalgorithm.dsa.array;

public class SecondLargestNumber {

    public static int[] getSecondOrderElements(int n, int []a) {
        int[] arr = new int[2];
        int one = secondLargest(a, n);
        int two = secondSmallest(a, n);

        arr[0] = one;
        arr[1] = two;

        return arr;

    }

    public static int secondSmallest(int[] a, int n){
        int smallest = a[0];
        int res = Integer.MAX_VALUE;

        for(int i = 1; i < n; i++){

            if(a[i] < smallest){
                res = smallest;
                smallest = a[i];

            }
            else if( a[i] != smallest && a[i] < res ){
                res = a[i];

            }

        }
        return res;


    }
    public static int secondLargest(int[] a, int n){
        int largest = a[0];
        int slargest = -1;

        for(int i = 1; i < n; i++){

            if(a[i] > largest){
                slargest = largest;
                largest = a[i];

            }
            else if( a[i] < largest && a[i] > slargest ){
                slargest = a[i];

            }

        }
        return slargest;


    }
}
