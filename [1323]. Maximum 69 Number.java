class Solution {
    public int maximum69Number (int num) {
        char [] nums = String.valueOf(num).toCharArray();
        for(int i =0; i<nums.length; i++){
            if(nums[i]=='6'){
                nums[i] = '9';         // where it's 6 it becomes 9 then breaks to avoid further change
                break;
            }
        }
        return Integer.parseInt(new String(nums));     //changing string to int as a new ver
    }
}
