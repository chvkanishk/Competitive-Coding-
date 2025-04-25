import java.util.*;

class SolPartition {
    public int arrpar(int[] arr){
        int result = 0;
        Arrays.sort(arr);
        for(int i=0 ; i<arr.length; i+=2){
            result += arr[i];
        }
        return result;
    }
}

public class arraypartition {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        SolPartition S = new SolPartition();
        System.out.println(S.arrpar(nums));

    }
}
