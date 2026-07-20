class Solution {
    public int climbStairs(int n) {
        if(n==1||n==0||n==2){
           return n;
        }
        int c = 2; int p =1;
        for(int i=3; i<=n; i++ ){
           int t = c;                           
           c=c+p;         
           p = t;      
        }    
        return c;
    }
}
