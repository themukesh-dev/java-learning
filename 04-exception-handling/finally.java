class A
{
    public static void main(String args[])
    {
        int i = 0;
        int j = 0;

        try
        {
            j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
// finally is executed irrespective of Exception
// Code in finally block will be executed even when there is a 
// exception or there isn't any 