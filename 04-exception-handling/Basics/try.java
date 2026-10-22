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
        System.out.println(j);
        System.out.println("All done");

    }
}

// Try is used when we tell java to try this code
// If it fails then we catch it by making Exception class and object e 
// which tells what has to be done
// The code after try runs even if there is an error