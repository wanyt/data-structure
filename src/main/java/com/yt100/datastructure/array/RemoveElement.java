package com.yt100.datastructure.array;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int leftVal = nums[left];
            if (leftVal == val) {
                nums[left] = nums[right];
                nums[right] = leftVal;
                right--;
            } else {
                count++;
                left++;
            }
        }
        return count;
    }

}
