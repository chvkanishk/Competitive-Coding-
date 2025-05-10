class Solution{
    public int product(int[] nums){
        int l1=0,l2=0;
        for (int i : nums){
            if (i>l1){
                l2=l1;
                l1= i;
            }
            else if(i>l2){
                l2=i;
            }
        }
        
        return (l1-1)*(l2-1);
    }
}



public class maxproduct {
    public static void main(String[] args) {
        int[] nums= {3,4,5,2};
        
        Solution s= new Solution();
        int r= s.product(nums);
        System.out.println(r);
    }
}
