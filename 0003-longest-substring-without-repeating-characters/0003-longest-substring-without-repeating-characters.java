class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[256];
            int currLength = 0;
            int currIdx = i;
            while(currIdx < s.length()) {
                char currChar = s.charAt(currIdx);
                if(seen[currChar]) {
                    break;
                }
                currLength++;
                seen[currChar] = true;
                currIdx++;
            }
            maxLength = Math.max(currLength, maxLength);
        }
        return maxLength;
    }
}