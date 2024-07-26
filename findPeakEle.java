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


//Using a linear Search
class Solution {
    public int findPeakElement(int[] nums) {
        //Tc: O(n) Sc: O(1) 
        int n = nums.length;
        for(int i = 0; i < n-1; i++)
        {
            if(nums[i] > nums[i+1]) return i;
        }
        return n-1;
    }   
}
