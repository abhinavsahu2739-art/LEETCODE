class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int product=1;
        int digit;
        
           while(n>=1){ 

            digit=n%10;
            sum+=digit;
            product*=digit;
            n=n/10;   
              
                
         }
         if(original%(sum + product)==0){
            return true;
         }else{
            return false;
         }
     
    }
}
