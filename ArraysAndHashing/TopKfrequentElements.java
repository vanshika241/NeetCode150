package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[1]-a[1]));
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            pq.add(new int[]{e.getKey() , e.getValue()});
        }
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            int curr[] = pq.poll();
            ans[i] = curr[0];
        }
        return ans;
    }
}
