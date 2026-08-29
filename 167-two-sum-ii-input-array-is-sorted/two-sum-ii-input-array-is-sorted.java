class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int i=0;
       int n=numbers.length-1;
       int j=n;
       while(i<j){
        int sum=numbers[i]+numbers[j];
        if(sum==target){
            return new int[] {i+1,j+1};
        }
        if(sum>target){
            j--;
        }
        else{
            i++;
        }
       }

       return new int[] {-1,-1};

    }
}