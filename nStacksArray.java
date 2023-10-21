package stack;
//https://www.codingninjas.com/studio/problems/n-stacks-in-an-array_1164271?topList=love-babbar-dsa-sheet-problems&leftPanelTab=1&campaign=Lovebabbarcodestudio11thfeb&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbarcodestudio11thfeb
public class nStacksArray {

}

import java.util.* ;
import java.io.*; 
public class NStack {
    // Initialize your data structure.
    int arr[];
    int top[];
    int next[];
    int n;
    int s;
    int freeSpot;
    public NStack(int N, int S) {
        // Write your code here.
        arr = new int[S];
        n = N;
        s = S;
        top = new int[n];
        next = new int[s];

        for(int i = 0 ; i < n ; i++) {
            top[i] = -1;
        }

        for(int i = 0 ; i < s ; i++) {
            next[i] = i+1;
        }
        next[s-1] = -1;

        freeSpot = 0;
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        // Write your code here.
        //check for overflow
        if(freeSpot == -1) {
            return false;
        }

        //find index
        int index = freeSpot;

        //update freeSpot
        freeSpot = next[index];

        //insert element
        arr[index] = x;

        //update next
        next[index] = top[m-1];

        //update top
        top[m-1] = index;

        return true;
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        // Write your code here.
        //check for underflow
        if(top[m-1] == -1) {
            return -1;
        }

        int index = top[m-1];

        top[m-1] = next[index];

        next[index] = freeSpot;

        freeSpot = index;

        return arr[index];
    }
}
