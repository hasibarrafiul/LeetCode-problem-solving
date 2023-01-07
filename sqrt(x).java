class Solution {
    public int mySqrt(int x) {
        int result=0;
        for(long i=0;i*i<=x;i++){
            result = (int)i;
        }
        return result;
    }
}
