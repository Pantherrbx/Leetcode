class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      Stack <Integer> s=new Stack<>();
      for(int n: nums2){
        while(!s.isEmpty() && s.peek()<n){
            int key=s.pop();
            map.put(key,n);
        }
        s.push(n);
      }
        while(!s.empty()){
            int key=s.pop();
            map.put(key,-1);
        }
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=map.get(nums1[i]);
        }
      return arr;
    }
}