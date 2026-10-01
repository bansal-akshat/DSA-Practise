class Solution {
    public boolean isPalindrome(int x) {
        int rx = 0, copyx = x;
        while (copyx>0){
            int d = copyx % 10;
            rx = (rx*10)+d;
            copyx/=10;
        }
        if(rx==x)
        return true;
        return false;
        
    }
}