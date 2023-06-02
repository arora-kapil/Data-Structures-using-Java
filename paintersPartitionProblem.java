import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int start = 0;
        int sum = 0;

        for(int i = 0 ; i < boards.size() ; i++) {
            sum += boards.get(i);
        }

        int end = sum;
        int mid = start + (end-start)/2;
        int ans = -1;

        while(start <= end) {
            if(isPossible(boards, k, mid)) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }

    public static boolean isPossible(ArrayList<Integer> boards, int k, int mid) {
        int painterCount = 1;
        int areaSum = 0;

        for(int i = 0 ; i < boards.size() ; i++) {
            if(areaSum + boards.get(i) <= mid) {
                areaSum += boards.get(i);
            }
            else {
                painterCount++;
                if(painterCount > k || boards.get(i) > mid) {
                    return false;
                }
                areaSum = boards.get(i);
            }

            if(painterCount > k) {
                return false;
            }
        }
        return true;
    }
}

public class paintersPartitionProblem {

}
