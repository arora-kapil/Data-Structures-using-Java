package leetCodeProblems;

/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.*/

class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping = new String[] {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",
        };
        
        List<String> result = new ArrayList<>();
        
        if(digits == null || digits.length() == 0) {
            return result;
        }
        
        backtrack(result, new StringBuilder(), digits, 0, mapping);
        return result;
    }
    
    public static void backtrack(List<String> result, StringBuilder current, String digits, int index, String[] mapping) {
        if(index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for(char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, current, digits, index + 1, mapping);
            current.deleteCharAt(current.length() - 1);
        }
    }
}