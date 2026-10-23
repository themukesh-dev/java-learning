class A
{
    public static void main(String args[])
    {
        int nums[] = new int[5];
        String str = null;

        try
        {
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Check the array lenght");
        }
        catch(Exception e)
        {
            System.out.println("Something is wrong");
        }

    
    }
}
// We can handle multiple exceptions using multiple catch statements