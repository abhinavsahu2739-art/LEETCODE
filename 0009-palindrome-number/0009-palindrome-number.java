class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int remainder,rev=0;


        while(x>0){
        remainder = x % 10;
        rev = rev * 10 + remainder;
        x /= 10;
        }

    if (original== rev) {
        return true;
    } else {
       return false ;
    }
    }
}