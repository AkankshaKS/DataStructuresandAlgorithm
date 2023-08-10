package com.akanksha.datastructuresalgorithm.dsa.array;

public class CheckIfAnArrayIsSorted {

    public static int isSorted(int n, int []a) {
        if (n == 1 || n == 0)
            return 1;
        if (a[n - 1] < a[n - 2])
            return 0;

        return isSorted(n-1, a);

    }


}
