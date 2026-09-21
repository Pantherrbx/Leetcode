class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map1.containsKey(nums[i])){
                return true;
            }
            else {
                map1.put (nums[i],i);
            }
        }
    return false;
    }
}