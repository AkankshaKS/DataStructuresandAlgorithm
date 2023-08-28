package com.akanksha.datastructuresalgorithm.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {

     // most optimal approach is using xor, which we still need to read.
    // brute force
        int n = nums.length;
//        for(int i = 0; i < n; i++){
//
//            int num = nums[i];
//            int count = 0;
//            for(int j = 0; j < n; j++){
//                if(nums[j] == num)
//                    count++;
//            }
//            if(count == 1) return num;
//        }
//
        //using map
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }

        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            if(it.getValue() ==1){
                return it.getKey();
            }

        }

        return -1;

    }
}
