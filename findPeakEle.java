//https://leetcode.com/problems/find-peak-element/description/

//Using binary search
class Solution {
    public int findPeakElement(int[] nums) {
        //Tc: O(logn) Sc: O(1) 
        int left = 0;
        int right = nums.length-1;

        while(left < right)
        {
            int mid = (left+right)/2;
            if(nums[mid] > nums[mid+1])  right = mid;
            else left = mid+1;
        }
        return right;
    }   
}
