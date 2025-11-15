
package BinarySearch;
public class SearchRotatedSortedArray {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target)return mid;
            if(nums[s]<=nums[mid]){
                //sorted part this and other not sorted
                if(nums[s]<=target && nums[mid] > target){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                //this is sorted 
                if(nums[mid] < target && nums[e] >= target){
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }
}