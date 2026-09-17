class Solution {
    public int[] dailyTemperatures(int[] t) {
       Stack <Integer> stack=new Stack<>();
       int arr[]=new int[t.length];
       for (int i=0 ; i<t.length;i++){
        while(!stack.isEmpty() && t[i]>t[stack.peek()]){
            int id=stack.pop();
            arr[id]=i-id;
        }
        stack.push(i);

       } 
       return arr;
    }
}