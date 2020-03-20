// Objective : Given a string, find the length of the longest substring without repeating characters.
// Author: Jayant Bhopale


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        Set<Character> set = new HashSet<Character>();
        while(right < s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right-left);
            }
        }
        return maxLength;
    }
}
