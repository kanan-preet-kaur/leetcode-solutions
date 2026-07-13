class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int haystackIdx = i;
            int needleIdx = 0;
            while(needleIdx < needle.length() && haystackIdx < haystack.length()) {
                if(needle.charAt(needleIdx) == haystack.charAt(haystackIdx)) {
                    needleIdx++;
                    haystackIdx++;
                }
                else{
                    break;
                }
                if(needleIdx == needle.length()){
                    return i;
                }
            }
        }
    return -1;
    }
}