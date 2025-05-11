
import java.util.HashSet;
import java.util.Set;

class Solution{
    public int longest(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }
        int longest =0;

        for(int n : nums){
            if(!set.contains(n-1)){
                int length = 1;
                while (set.contains(n+length)){
                    length++;
                }
                longest= Math.max(longest, length);
            }
        }

        return longest;
    }
}


public class longestsequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        Solution s = new Solution();
        System.out.println(s.longest(nums)); 
    }
}
