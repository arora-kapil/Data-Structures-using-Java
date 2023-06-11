	import java.util.* ;
	import java.io.*; 

	public class printLikeAWave {
		public static int[] wavePrint(int arr[][], int nRows, int mCols) {
			// Write your code here.
			int k = 0;
			int num = nRows*mCols;
			int[] ans = new int[num];
			for(int i = 0 ; i < mCols ; i++) {
				if(i%2 == 0) {
					for(int j = 0 ; j < nRows ; j++) {
						ans[k++] = arr[j][i];
					}
				}
				else {
					for(int j = nRows - 1 ; j >= 0 ; j--) {
						ans[k++] = arr[j][i];
					}
				}
			}
			return ans;
		}
	}