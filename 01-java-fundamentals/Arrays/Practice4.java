// To print number of even and odd numbers in an array
class A
{
    public static void main(String[] args)
    {
     int nums[]={12,23,4,23,112,65,333,56,212,6778,9};
     int even=0;
     int odd=0;
     
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]%2==0)
        {
            even++;
        }
        else
        odd++;
    }
    System.out.println("Even= " + even);
    System.out.println("Odd= " + odd);
    }
}

