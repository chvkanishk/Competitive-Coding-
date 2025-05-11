import java.util.HashSet;

class Solution{
    public int substring(String s){
        int left =0;
        int maxl=0;
        HashSet<Character> set = new HashSet<>();

        for (int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxl= Math.max(maxl, i-left+1);
        }
        
        return maxl;
    }
}


public class longestsubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        
        Solution sol = new Solution();
         System.out.println(sol.substring(s));
    }
}
