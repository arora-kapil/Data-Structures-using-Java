package stack;
//https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1
public class celebrityProblem {

}

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
  public static void main(String args[]) throws IOException { 
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t>0)
      {
          int N = sc.nextInt();
          int M[][] = new int[N][N];
          for(int i=0; i<N; i++)
          {
              for(int j=0; j<N; j++)
              {
                  M[i][j] = sc.nextInt();
              }
          }
          System.out.println(new Solution().celebrity(M,N));
          t--;
      }
  } 
} 
//} Driver Code Ends


//User function Template for Java
//import java.util.*;

class Solution
{ 
  
  public static boolean knows(int M[][], int a, int b) {
      if(M[a][b] == 1) {
          return true;
      }
      
      return false;
  }
  //Function to find if there is a celebrity in the party or not.
  int celebrity(int M[][], int n)
  {
  	// code here 
  	Stack<Integer> st = new Stack<>();
  	
  	for(int i = 0 ; i < n ; i++) {
  	    st.push(i);
  	}
  	
  	while(st.size() > 1) {
  	    int first = st.peek();
  	    st.pop();
  	    int second = st.peek();
  	    st.pop();
  	    
  	    if(knows(M, first, second)) {
  	        st.push(second);
  	    }
  	    else{
  	        st.push(first);
  	    }
  	}
  	
  	int candidate = st.peek();
  	
  	boolean rowCheck = false;
  	int rowCount = 0;
  	
  	for(int i = 0 ; i < n ; i++) {
  	    if(M[candidate][i] == 0) {
  	        rowCount++;
  	    }
  	}
  	
  	if(rowCount == n) {
  	    rowCheck = true;
  	}
  	
  	boolean colCheck = false;
  	int colCount = 0;
  	
  	for(int i = 0 ; i < n ; i++) {
  	    if(M[i][candidate] == 1) {
  	        colCount++;
  	    }
  	}
  	
  	if(colCount == n-1) {
  	    colCheck = true;
  	}
  	
  	if(rowCheck && colCheck) {
  	    return candidate;
  	}
  	else {
  	    return -1;
  	}
  }
}
