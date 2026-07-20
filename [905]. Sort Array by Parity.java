class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while(left<right){
            if(nums[left]%2==0){      
                left++;
            }
            else if(nums[right]%2!=0){
                right--;                      
            }
            else{
                int temo = nums[left];           
                nums[left]= nums[right];         
                nums[right] = temo;                
                left++;
                right--;
            }
        }
        return nums;
    }
}
