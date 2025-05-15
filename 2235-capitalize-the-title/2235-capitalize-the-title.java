class Solution {
    public String capitalizeTitle(String t) {
        char res[] = t.toCharArray();
        int n = res.length;
        int start = 0;
        for(int i=0;i<=n;i++){
            if(i==res.length ||res[i]==' '){
                int length = i-start;

                if(length<=2){
                    for(int j = start;j<i;j++){
                        res[j] = Character.toLowerCase(res[j]);
                    }
                }else{
                    res[start]=Character.toUpperCase(res[start]);
                    for(int j=start+1;j<i;j++){
                        res[j]=Character.toLowerCase(res[j]);
                    }
                }
                start = i+1;
            }

        }
        return new String(res);
    }
}