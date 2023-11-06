class srchunkn
{
    public int search(ArrayReader reader, int target)
    {
        //Tc: O(logn) Sc: O(1)
        int l = 0;
        int h = 1;
        while(reader.get(h) < target){
            l = h;
            h = h * 2;
        }
        while(l <= h)
        {
            int mid = l + (h -l)/2;
            if(reader.get(mid) == target) return mid; //Recursion can also be done recursively here instead of an iterative approach.
            else if (target < reader.get(mid)) h = mid-1; // But Recursion using recursive stack takes extra space for the stack and is not advisable.
            else l = mid +1;
        }
        return -1;
    }
}
