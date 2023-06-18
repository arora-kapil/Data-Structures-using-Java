//https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqa3p3WGJiNFF1clY3SFNCb05rMDgwWHUyQjlUQXxBQ3Jtc0tuNXF5RE9LdHdkcUh1bEc3M3pGV2NFSDJ3bWdkelFsWHJBUnZ3ejhQLXpxeFhmbjRJWUllZkhKLU9MZk45b3M5aHNCUVdwSTY4d3UtUm9XSktVX29wMlEwRENtMWNRNjNWMXpSTU5DZHdBbnVlT1F5aw&q=https%3A%2F%2Fleetcode.com%2Fproblems%2Ffibonacci-number%2F&v=zg8Y1oE4qYQ

public class fibonnacciRecursion {

}

class Solution {
    public int fib(int n) {
        if(n <= 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
