package BinarySearch;

public class MinElementInSortedArray {
    
    public int findMin(int[] nums) {
       int n = nums.length;
       int s = 0;
       int e = n-1;
       int min = Integer.MAX_VALUE;
       while(s<=e){
        int mid = s + (e-s)/2;
        if(nums[s]<=nums[mid]){
            //sorted 
            min = Math.min(min , nums[s]);
            s = mid+1;
        }
        else{
            //right part sorted
            min = Math.min(min , nums[mid]);
            e = mid-1;
        }
       }
       return min;
    }
}
