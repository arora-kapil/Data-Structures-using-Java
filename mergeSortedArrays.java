
public class mergeSortedArrays {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        
        int[] arr = new int[m];
        for(int l = 0 ; l < m ; l++) {
            arr[l] = nums1[l];
        }

        int k = 0;
        while(i < m && j < n) {
            if(arr[i] < nums2[j]) {
                nums1[k] = arr[i];
                
                i++;
            }
            else {
                nums1[k] = nums2[j];
                
                j++;
            }
            k++;
        }

        while(i < m) {
            nums1[k] = arr[i];
            k++;
            i++;
        }

        while(j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }

    }
}
