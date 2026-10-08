// Find the largest element
class A
{
    public static void main(String[] args)
    {
        int nums[]=new int[4];
        nums[0]=2;
        nums[1]=3;
        nums[2]=4;
        nums[3]=9;

       int largest = nums[0];

       for(int i = 0 ; i<nums.length;i++)
       {
        if(nums[i]>largest)
        {
            largest = nums[i];
        }
       }

       System.out.println(largest);
    

    }
}