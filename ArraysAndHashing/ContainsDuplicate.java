package ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(nums[j] == nums[i]){
        //             return true;
        //         }
        //     }
        // }

        // Arrays.sort(nums);
        // for(int i=1;i<n;i++){
        //     if(nums[i] == nums[i-1])return true;
        // }
        

        HashSet<Integer> hset = new HashSet<>();
        for(int num : nums){
            if(!hset.add(num)){
                return true;
            }
        }

         return false;

    }
}
