public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverseWord(chars, start, i - 1);
                start = i + 1;
            }
        }
      
        reverseWord(chars, start, chars.length - 1);
        return new String(chars);
    }
    
    private void reverseWord(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}