class Solution {
    public boolean backspaceCompare(String s, String t) {
       String s1=preprocess(s);
       String s2=preprocess(t);
       if(s1.equals(s2)) return true;
       return false;
    }
    public String  preprocess(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && c=='#') stack.pop();
            else if(c!='#') stack.push(c);
        }
        return stack.toString();
    }
}