import java.util.Scanner;
public class checkPallindromRecursion {

	public static boolean isPallindrome(String str, int start, int end) {
		if(start > end) {
			return true;
		}
		
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		start++;
		end--;
		return isPallindrome(str, start, end);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int n = str.length();
		
		if(isPallindrome(str, 0, n-1)) {
			System.out.println("The given string is a pallindrome.");
		}
		else {
			System.out.println("The given string is not a pallindrome.");
		}
	}
	
}
