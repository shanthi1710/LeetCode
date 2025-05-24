class Solution {
    public int maxPower(String s) {
        int mc = 1;
        int cc=1;

        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                cc++;
                mc = Math.max(mc,cc);
            }else{
                cc=1;
            }
        }
        return mc;
    }
}