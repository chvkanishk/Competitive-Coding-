class Solution{
    public boolean isPal(String s){
        s= s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l=0;
        int r= s.length()-1;
        while(l<r){
            if (s.charAt(l) != s.charAt(r)) {
                return false;   
            }
            l++;
            r--;
        }
        return true;
    }
}


public class isPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        Solution sol = new Solution();
        System.out.println(sol.isPal(s));
    }
}
