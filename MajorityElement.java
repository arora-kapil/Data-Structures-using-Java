package leetCodeProblems;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        int ans = nums[0];
        int count = 1;

        for(int num : nums) {
            if(num == ans) {
                count++;
            }
            else {
                count--;
            }

            if(count == 0) {
                ans = num;
                count = 1;
            }
        }

        return ans;
    }
}
