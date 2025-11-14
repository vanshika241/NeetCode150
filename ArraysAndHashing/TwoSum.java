package ArraysAndHashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }

        HashMap<Integer , Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            int rem = target-nums[i];
            if(hmap.containsKey(rem)){
                return new int[]{hmap.get(rem),i};
            }
            else{
                hmap.put(nums[i] , i);
            }
        }
         return new int[]{-1,-1};
    }
}
