package ArraysAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0;
        if(n == 1)return 1;
        
        int maxCnt = 1;
        // int cnt = 1;
        // Arrays.sort(nums);
        // for(int i=1;i<n;i++){
        //     if(nums[i] == nums[i-1])continue;
        //     if(nums[i] == nums[i-1]+1){
        //         cnt++;
        //         maxCnt = Math.max(maxCnt , cnt);
        //     }
        //     else{
        //         cnt = 1;
        //     }
        // }

        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++)s.add(nums[i]);
        for(int num : s){
            if(!s.contains(num-1)){
                int currCnt = 1;
                int currNum = num;
                while(s.contains(currNum+1)){
                    currNum++;
                    currCnt++;
                }
                maxCnt = Math.max(maxCnt , currCnt);
            }
        }
        return maxCnt;
    }
}
