package com.akanksha.datastructuresalgorithm.dsa.array;

import java.util.Scanner;

public class LeftRotateArrayByDPlaces {

    public static void main(String args[]) {

        // Brute Force solution

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        int k = sc.nextInt();
        rotate(nums,k);

    }

        public static void  rotate(int[] arr, int k) {

            int n = arr.length;
            k = k % n;
            int[] temp = new int[k];

            //for right rotation: Brute
            // for (int i = n - k; i < n; i++) {
            //     temp[i - n + k] = arr[i];
            // }
            // for (int i = n - k - 1; i >= 0; i--) {
            //     arr[i + k] = arr[i];
            // }
            // for (int i = 0; i < k; i++) {
            //     arr[i] = temp[i];
            // }

            //for right rotation: optimal
            reverse(arr, 0, n-k-1);
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-1);


            //for left rotation: optimal
            // reverse(arr, 0, k - 1);
            // reverse(arr, k , n - 1);
            // reverse(arr, 0, n - 1);

            //for left rotation
            // for(int i = 0; i < k; i++){
            //     temp[i] = nums[i];

            // }

            // for(int i = k; i < n; i++){
            //     nums[i-k] = nums[i];
            // }

            // for(int i = n-k; i < n; i++){
            //     nums[i] = temp[i - (n - k)];
            // }

        }

        static void reverse(int[] arr, int start, int end){

            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }

        }

}
