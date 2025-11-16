package SlidingWindow;
import java.util.*;
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int i = 0;
        int j = 0;
        int ans[] = new int[n-k+1];
        int idx = 0;
        Deque<Integer> dq = new LinkedList<>();
        while(j<n){
           
              while(!dq.isEmpty() && nums[dq.peekLast()]<nums[j]){
                dq.removeLast();
              }
              dq.addLast(j);
               
               if(!dq.isEmpty() && dq.peekFirst()<i){
                    dq.removeFirst();
               }
               
              if(j-i+1 == k){
                  ans[idx] = nums[dq.peekFirst()];
                  idx++;
                  i++;
              }
           j++;
        }
        return ans;
    }
}