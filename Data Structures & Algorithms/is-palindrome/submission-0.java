class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length()-1;
        while(p1<p2){
            if(!Character.isLetterOrDigit(s.charAt(p1)))
                p1+=1;
            else if(!Character.isLetterOrDigit(s.charAt(p2)))
                p2-=1;
            else if(s.charAt(p1)!=s.charAt(p2))
                return false;
            else{
                p1+=1;
                p2-=1;
            }
        }
        return true;
    }
}
