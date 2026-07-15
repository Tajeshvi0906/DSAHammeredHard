class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even = 0;
        int odd = 0;
        for(int i = 1;i<=2*n;i++){
            if(i%2==0){
               even = even + i;
            } else{
                 odd = odd + i;
            }
        }
        if(even % n == 0 && odd % n == 0){
            return n;
        }
        return -1;
    }
}