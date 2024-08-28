package leetCodeProblems;

/*Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.*/

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                return true;
            }
            else {
                map.put(num, 1);
            }
        }

        return false;
    }
}

