package leetCodeProblems;

//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

//Return true if you can reach the last index, or false otherwise.

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length <= 1) {
            return true;
        }

        int max = nums[0];  //max length possible

        for(int i = 0 ; i < nums.length ; i++) {
            if(max <= i && nums[i] == 0) {  //if max falls short and the current value is also 0
                return false;
            }
            
            if(i + nums[i] > max) {
                max = i + nums[i];
            }

            if(max >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
