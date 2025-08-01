import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums){
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        int max= 0;
        for(int i=1;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if (nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    prev[i]=j;
                }
            }
        
            if (dp[i]>dp[max]) max=i;
        }
            List<Integer> ans =new ArrayList<>();
            for (int i = max; i >= 0; i = prev[i]){
                ans.add(nums[i]);
            
        }
        return ans;

    }
    
}
public class LongestDivisible {
    public static void main(String[] args) {
        int[] nums = {1,2,4,8};

        Solution s = new Solution();
        System.out.println(s.largestDivisibleSubset(nums));
    }
}