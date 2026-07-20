    class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] r = new int[nums.length];  
       int e = 0; //elements

       for(int i =0; i<n; i++){
        r[e++] = nums[i];  
        r[e++] = nums[i+n];   
       }
       return r;        
    }
}
