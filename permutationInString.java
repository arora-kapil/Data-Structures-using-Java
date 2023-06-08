
public class permutationInString {

	public static boolean checkEqual(int count1[], int count2[]) {
        for(int i = 0 ; i < 26 ; i++) {
            if(count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int[] count1 = new int[26];
        Arrays.fill(count1, 0);

        for(int i = 0 ; i < n ; i++) {
            int ind = s1.charAt(i) - 'a';
            count1[ind]++;
        }

        int i = 0;
        int[] count2 = new int[26];
        Arrays.fill(count2, 0);

        while(i < n && i < s2.length()) {
            int ind = s2.charAt(i) - 'a';
            count2[ind]++;
            i++;
        }

        if(checkEqual(count1, count2)) {
            return true;
        }

        while(i < s2.length()) {
            char newCh = s2.charAt(i);
            int ind = newCh - 'a';
            count2[ind]++;
            char oldCh = s2.charAt(i - n);
            ind = oldCh - 'a';
            count2[ind]--;
            if(checkEqual(count1, count2)) {
            return true;
            }
            i++;
        }

        return false;

    }
}
