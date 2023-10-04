import stack;

public class reverseStringStack {

	static class Stack {
		int top;
		char arr[];
		int size;
		
		Stack(int s) {
			arr = new char[s];
			top = -1;
			size = s;
		}
		
		public void push(char element) {
			if(top - size > 1) {
				top++;
				arr[top] = element;
			}
		}
		
		public char pop() {
			top--;
			return arr[top+1];
		}
	}
	
	public static void main(String args[]) {
		Stack st = new Stack(6);
		
		st.push('k');
		st.push('a');
		st.push('p');
		st.push('i');
		st.push('l');
		
		String str = new String();
		for(int i = 0 ; i < 5 ; i++)
			System.out.println(st.pop());
		
		//System.out.println("String reversed is: " + str);
	}
}
