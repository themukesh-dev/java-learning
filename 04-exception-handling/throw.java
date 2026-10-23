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
            throw new ArithmeticException(); //Throw is used to explicitly create an exception
        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("This is the default output");
        }
        System.out.println(j);
    }
}