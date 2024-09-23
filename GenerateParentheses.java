package leetCodeProblems;

/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    
    private static void backtrack(List<String> result, StringBuilder current, int open, int close, int max) {
        if(current.length() == max*2) {
            result.add(current.toString());
            return;
        }
        
        if(open < max) {
            current.append('(');
            backtrack(result, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }
        
        if(close < open) {
            current.append(')');
            backtrack(result, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }
    }
}