class Solution{
    public int maxdiff(int[] nums){
        int j=nums[0], result = -1;
        for (int i = 1;i<nums.length;i++){
            if (nums[i]>j){
                result = Math.max(result , (nums[i]-j));
            }
            else{
                j = nums[i];
            }
        }
        return result;   
    }
}

public class maxdiff {
    public static void main(String[] args) {
        int[] nums= {7,1,5,4};
        
        Solution s= new Solution();
        System.out.println(s.maxdiff(nums));
    }
}
