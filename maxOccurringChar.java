
public class maxOccurringChar {

	public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        //int arr[26] = {0};
        
        for(int i = 0 ; i < line.length() ; i++) {
            char ch = line.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                int temp = ch - 'a';
                arr[temp]++;
            }
            else {
                int temp = ch - 'A';
                arr[temp]++;
            }
        }
        
        int max = -1;
        int ind = -1;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ind = i;
            }
        }
        
        char ans = (char) (ind + 97);
        return ans;
    }
}
