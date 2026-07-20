class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int i=0; nums.length>i; i++){
            int count = nums[i];
            int d = 0;
            while(count!=0){
                count/=10;
                d++;
            }
                if(d%2==0){
                    result++;
                }
        }
        return result;
    }
}
