package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.toLowerCase();
        int i=0;
        int j = n-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else{
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
