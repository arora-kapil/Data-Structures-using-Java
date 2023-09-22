
public class stack {
	public int arr[];
	public int top;
	public int size;
	
	stack(int s) {
		size = s;
		arr = new int[s];
		top = -1;
	}
	
	public void push(int el) {
		if((size - top) > 1) {
			System.out.println("Inserting " + el + " in the stack.");
			arr[++top] = el;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	public void pop() {
		if(top >= 0) {
			System.out.println("Removing " + arr[top]);
			top--;
			return;
		}
		
		System.out.println("Stack Underflow");;
	}
	
	public int peek() {
		if(top >= 0) {
			return arr[top];
		}
		
		System.out.println("Stack is Empty!");
		return -1;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		stack st = new stack(3);
		 
        st.push(1);      // inserting 1 in the stack
        st.push(2);      // inserting 2 in the stack
 
        st.pop();        // removing the top element (2)
        st.pop();        // removing the top element (1)
 
        st.push(3);      // inserting 3 in the stack
 
        System.out.println("The top element is " + st.peek());
        System.out.println("The stack size is " + st.size);
 
        st.pop();        // removing the top element (3)
 
        // check if the stack is empty
        if(st.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
