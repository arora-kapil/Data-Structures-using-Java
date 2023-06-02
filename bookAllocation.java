import java.util.Scanner;
public class bookAllocation {

	static boolean isPossible(int[] arr, int n, int m, int mid) {
		int studentCount = 1;
		int pageSum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			if(pageSum + arr[i] <= mid) {
				pageSum += arr[i];
			}
			else {
				studentCount++;
				if(studentCount > m || arr[i] > mid) {
					return false;
				}
	 
				pageSum = arr[i];
			}
		}
		
		return true;
	}
	
	static int allocateBooks(int[] arr, int n, int m) {
		int start = 0;
		int sum = 0;
		int ans = -1;
		
		for(int i = 0 ; i < n ; i++) {
			sum += arr[i];
		}
		
		int end = sum;
		int mid = start + (end - start)/2;
		
		while(end <= start) {
			if(isPossible(arr, n, m, mid)) {
				ans = mid;
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			mid = start + (end-start)/2;
			System.out.println(mid);
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40};
		int n = 4;
		int m = 2;
		
		System.out.println(allocateBooks(arr, n, m));
	}
}
