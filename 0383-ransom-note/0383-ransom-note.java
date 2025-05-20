class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        Map<Character, Integer>mp = new HashMap<>();

        for(int i=0;i<m;i++){
            mp.put(magazine.charAt(i),mp.getOrDefault(magazine.charAt(i),0)+1);
        }
       
        for(int i=0;i<n;i++){
            char c = ransomNote.charAt(i);
            if (!mp.containsKey(c) || mp.get(c) <= 0){
                return false;
            }
            mp.put(ransomNote.charAt(i), mp.get(ransomNote.charAt(i)) - 1);
        }
        return true;
    }
}