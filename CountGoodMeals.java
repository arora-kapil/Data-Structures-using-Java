package leetCodeProblems;

/*A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.

You can pick any two different foods to make a good meal.

Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.

Note that items with different indices are considered different even if they have the same deliciousness value.*/


class Solution {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int num : deliciousness) {
            for(int power = 1 ; power <= (1 << 21) ; power <<= 1) {
                if(map.containsKey(power - num)) {
                    ans = (ans + map.get(power - num)) % 1000000007;
                }
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}