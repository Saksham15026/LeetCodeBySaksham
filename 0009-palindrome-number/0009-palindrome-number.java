class Solution {
    public boolean isPalindrome(int x) {
        int originalX= x;
        int number=0;
        while(x>0){
            int reminder = x%10;
            number = number*10 + reminder;
            x=x/10;
        }
        if(originalX ==number){
            return true;
        }
       return false;
    }
}