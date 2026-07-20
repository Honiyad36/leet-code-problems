class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        while(x!=0){
         int rev= x%10;
         temp/=10;
         rev = (rev*10)+temp;
         if(rev==x)
            System.out.println(x);
        }
            return false;        
    }
}
