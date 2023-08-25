package com.akanksha.datastructuresalgorithm.dsa.array;

public class CheckIfAnArrayIsSorted {

    public static int isSorted(int n, int []a) {

       //Recursion approach
        if (n == 1 || n == 0)
            return 1;
        if (a[n - 1] < a[n - 2])
            return 0;

        return isSorted(n-1, a);


        //Iterative Approach
     /*   for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1])
                return 0;
        }

        return 1;*/

    }


}
