class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIn = new int[128];

        int left = 0;

        for(int right = 0;right<n;right++){
            char cChar = s.charAt(right);
            left = Math.max(left,charIn[cChar]);

            maxLength = Math.max(maxLength,right-left+1);
            charIn[cChar]=right+1;
        }
        return maxLength;
    }
}