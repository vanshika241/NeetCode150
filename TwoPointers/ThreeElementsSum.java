package TwoPointers;

import java.util.*;
public class ThreeElementsSum {
    public List<List<Integer>> threeSum(int[] nums) {
       // HashSet<List<Integer>> s = new HashSet<>();
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k = j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k] == 0){
        //                 List<Integer> list =  Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(list);
        //                 s.add(list);
        //             }
        //         }
        //     }
        // }

        // for(int i=0;i<n;i++){
        //     HashMap<Integer,Integer> mp = new HashMap<>();
        //     for(int j=i+1;j<n;j++){
        //         int rem = -(nums[i]+nums[j]);
        //         if(mp.containsKey(rem)){
        //             List<Integer> list =  Arrays.asList(nums[i],nums[j],rem);
        //             Collections.sort(list);
        //             s.add(list);
        //         }
        //         mp.put(nums[j],j);
        //     }
        // }
        // List<List<Integer>> ans = new ArrayList<>(s);
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> list =  Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(list);

                    while(j<k && nums[j+1] == nums[j])j++;
                    while(j<k && nums[k-1] == nums[k])k--;
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}
