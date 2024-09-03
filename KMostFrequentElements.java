package leetCodeProblems;

/*Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0 ; i < freq.length ; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for(int i = freq.length - 1 ; i > 0 && index < k ; i--) {
            for(int n : freq[i]) {
                res[index++] = n;
                if(index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
