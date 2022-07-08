package com.prasamsa;

public class Odd {
    public static void main(String[] args) {

        int nums[] = {0, 1, 2, 3, 4, 5 ,6, 7, 8 , 9, 10, 11, 12};

        System.out.println(nums.length);

        for(int i = 0; i <nums.length; i++) {
            if(nums[i] % 2 == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
