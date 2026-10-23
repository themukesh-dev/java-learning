class MukeshException extends Exception
{
    public MukeshException(String str)
    {
        super(str);
    }
}



class A
{
    public static void main(String args[])
    {
        int i = 20;
        int j;
        try
        {
            j = 18/i;
            if(j==0)
            throw new MukeshException("Cannot divide by zero"); //Throw is used to explicitly create an exception
        }
        catch(MukeshException e)
        {
            j=18/1;
            System.out.println("This is the default output" + e);
        }
        System.out.println(j);
    }
}

// We can make custom exception but it must be a class and that class must extend to Exception or RuntimeException