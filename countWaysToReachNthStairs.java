//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbGlYUUpTTUdBbEphRDM4WnpDd19LM3dkc3ZBUXxBQ3Jtc0tsSDlhdGp5Z2ozUkRZajdhS1RNNy1EQ0hWenA0MVVkb0ozdnhSMVlQUi1vaDdGVXRIM3U0WGNUc3dkY1lWV0t3YXhUM2JwdFZkbkY3REx4S3NXUlBXWkN1TDRzN3labFRMZ2owQWV2dk5od0RiU2hwaw&q=https%3A%2F%2Fbit.ly%2F32VA96H&v=zg8Y1oE4qYQ

public class countWaysToReachNthStairs {

}

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countDistinctWayToClimbStair(long nStairs) {
		// Write your code here.
		if(nStairs < 0) {
			return 0;
		}
		else if(nStairs == 0) {
			return 1;
		}

		return countDistinctWayToClimbStair(nStairs-1) + countDistinctWayToClimbStair(nStairs-2);
	}
}
