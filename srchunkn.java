class srchunkn
{
    public int search(ArrayReader reader, int target)
    {
        int l = 0;
        int h = 1;
        while(reader.get(h) < target){
            l = h;
            h = h * 2;
        }
        while(l <= h)
        {
            int mid = l + (h -l)/2;
            if(reader.get(mid) == target) return mid;
            else if (target < reader.get(mid)) h = mid-1;
            else l = mid +1;
        }
        return -1;
    }
}