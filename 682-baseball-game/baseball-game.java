class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
         for(String c : operations){
            if(c.equals("+")){
                int a=s.pop();
                int b=s.peek();
                s.push(a);
                s.push(a+b);
            }
            else if(c.equals("D")){
                    int a=s.peek();
                    s.push(a*2);
            }
            else if(c.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(c));
            }
         }
         int sum=0;
        while(!s.isEmpty()){
                sum+=s.pop();
         }
         return sum;
    }
}