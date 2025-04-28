class Solution {
    public String simplifyPath(String path) {
        Stack<String>stack=new Stack<>();
        String[] temp = path.split("/");
        for(String x:temp){
            if(x.equals("")||x.equals(".")){
                continue;
            }
            if(x.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,"/"+stack.pop());
        }

        return sb.length()==0?"/":sb.toString();
    }
}