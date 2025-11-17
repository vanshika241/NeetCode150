
package LinkedListQues;

public class FindDuplicateNumber {

     public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            int correctIdx = nums[i]-1;
            if(correctIdx >= 0 && nums[i]<=n && nums[i] != nums[correctIdx]){
                int temp = nums[correctIdx];
                nums[correctIdx] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int idx = 0;idx<n;idx++){
            if(nums[idx] != idx+1){
                return nums[idx];
            }
        }
        return n+1;
    }
    
}