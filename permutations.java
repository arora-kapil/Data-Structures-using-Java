//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqa21rOXoyZXBja0RBaFhZZzNNZUNzR19pWi1NQXxBQ3Jtc0ttZ0NqN3hQRFA5dElEd3JxelVtbGhVMlBOekdmcEthSjl4M2cwUWVyTHRuNlMtYU5YcFBNWU1FYmU5V093UkYyb2h6X3I5aU9aNktHNDF4anY5UlFWYnk2MVVxSktrU1plbF9YZ2RDTjN5cEhOVlVBUQ&q=https%3A%2F%2Fleetcode.com%2Fproblems%2Fpermutations%2F&v=va3NEycUxsg
public class permutations {

}

class Solution {

    public static void solve(int[] nums, List<List<Integer>> ans, int index) {
        if(index >= nums.length) {
            ans.add(Arrays.stream(nums)
        .mapToObj(Integer::valueOf)
        .collect(Collectors.toList()));
            return;
        }

        for(int j = index ; j < nums.length ; j++) {
            int temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
            solve(nums, ans, index+1);
            temp = nums[index];
            nums[index] = nums[j];
            nums[j] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<List<Integer>>();
       int index = 0;
       solve(nums, ans, index);
       return ans;
    }
}
