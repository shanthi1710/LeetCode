class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character>sToT = new HashMap<>();
        Map<Character,Character>tToS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char chars = s.charAt(i);
            char chart = t.charAt(i);

            if(sToT.containsKey(chars)){
                if(sToT.get(chars)!=chart){
                    return false;
                }
            }else{
                sToT.put(chars,chart);
            }
            if(tToS.containsKey(chart)){
                if(tToS.get(chart)!=chars){
                    return false;
                }
            }else{
                tToS.put(chart,chars);
            }
        }
        return true;
    }
}