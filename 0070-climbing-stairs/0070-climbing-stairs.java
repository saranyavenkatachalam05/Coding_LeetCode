class Solution {
    public int climbStairs(int n) {
        int n1=1,n2=1;
        for(int i=0;i<n;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }return n1;
    }
}