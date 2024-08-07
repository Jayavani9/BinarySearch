//Solution Using Binary Search 

class Solution {
    //Tc: O(logn)   Sc: O(1)
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l <=h){
        int mid = l + (h-l)/2;
        if(nums[mid] ==target) return mid;
        else if(nums[mid] >= nums[l])
        {
            if(nums[mid] > target && nums[l] <=target)
            {
                h = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        else
        {
            if(target > nums[mid] && target <= nums[h])
            {
                l = mid + 1;
            }
            else
            {
                h = mid - 1;
            }
        }
        }

        return -1;


        
    }
}
