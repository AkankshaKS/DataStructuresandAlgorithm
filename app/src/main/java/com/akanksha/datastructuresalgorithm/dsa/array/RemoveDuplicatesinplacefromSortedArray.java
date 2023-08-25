package com.akanksha.datastructuresalgorithm.dsa.array;

public class RemoveDuplicatesinplacefromSortedArray {
    public int removeDuplicates(int[] nums) {
        int res = 1;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i - 1]){
                nums[res] = nums[i];
                res++;

            }
        }

        System.out.print(nums.length + ", nums = " + nums);
        return res;

    }

}
