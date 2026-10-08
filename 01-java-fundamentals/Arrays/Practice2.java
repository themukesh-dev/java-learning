// Find the smallest element
class A
{
    public static void main(String[] args)
    {
        int nums[]=new int[4];
        nums[0]=2;
        nums[1]=3;
        nums[2]=1;
        nums[3]=9;

       int smallest = nums[0];
       
       for(int i = 0 ; i<nums.length;i++)
       {
        if(nums[i]<smallest)
        {
            smallest = nums[i];
        }
       }
       System.out.println(smallest);
    }
}
