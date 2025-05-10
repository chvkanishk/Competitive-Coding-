class Solution{
    public int count(int[] nums){
        int n= 0;
        for(int i = 0; i < nums.length-2; i++) {
            if (2 * (nums[i] + nums[i + 2]) == nums[i + 1]) {
                n++;
            }
        }
        return n;
    }
}


public class CountSubarrays {
    public static void main(String[] args) {
        int[] nums= {1,2,1,4,1}; 

        Solution s = new Solution();
        System.out.println(s.count(nums));
    }
    
}
