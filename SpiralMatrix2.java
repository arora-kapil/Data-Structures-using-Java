
public class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        if(n == 1)
        {
            arr[0][0] = 1;
            return arr;
        }

        int l = 0, r = n-1, t = 0, b = n-1, d = 0;
        int num = 1;

        while(t <= b && l <= r)
        {
            if(d == 0)
            {
                for(int i = l ; i <= r ; i++)
                {
                    arr[t][i] = num;
                    System.out.println(num);
                    num++;
                    System.out.println(num);
                }
                d = 1;
                t++;
            }
            else if(d == 1)
            {
                for(int i = t ; i <= b ; i++)
                {
                    arr[i][r] = num;
                    num++;
                }
                d = 2;
                r--;
            }
            else if(d == 2)
            {
                for(int i = r ; i >= l ; i--)
                {
                    arr[b][i] = num;
                    num++;
                }
                b--;
                d = 3;
            }
            else if(d == 3)
            {
                for(int i = b ; i >= t ; i--)
                {
                    arr[l][i] = num;
                    num++;
                }
                l++;
                d = 0;
            }
        }

        return arr;
    }
}