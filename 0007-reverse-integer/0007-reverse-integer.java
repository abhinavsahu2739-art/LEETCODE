class Solution {
    public int reverse(int x) {
        int original=x;
        long rev=0;
        int digit;
        
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
            x/=10;
        }
        if (rev>2147483647 || rev<-2147483648){
            return 0;
        }
        return (int) rev;
    }
}