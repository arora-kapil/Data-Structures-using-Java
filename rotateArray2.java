
public class rotateArray2 {

	public void rotate(int[] nums, int k) {
        int l = nums.length;
        if(l == 1 || l == 0)
        {
            return;
        }
        if(k >= l)
        {
            k = k%l;
        }
        int[] arr = new int[l];
        for(int i = 0 ; i < l ; i++)
        {
            arr[i] = nums[i];
        }

        for(int i = 0 ; i < l ; i++)
        {
            int pos = (i+k)%l;
            nums[pos] = arr[i];
        }
    }
}
