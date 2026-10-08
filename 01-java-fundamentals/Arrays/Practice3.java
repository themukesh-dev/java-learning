// Reverse an array 
class A
{
    public static void main(String[] args)
    {
        int nums[] = {12,34,32,54,67,64};
        int rev;

        for(int i = nums.length-1; i>=0;i--)
        {
            rev = nums[i];
            System.out.println(rev);
        }


    }
}