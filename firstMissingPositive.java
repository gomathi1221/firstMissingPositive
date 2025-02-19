class Solution {
    public int firstMissingPositive(int[] nums) {
      int s=1;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
        if(s==nums[i]){
            s++;
            
        }
        else if(s<nums[i]){
            break;
        }
      }
      }
      return s;
        
    }
}