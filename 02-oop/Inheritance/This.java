class M
{
    public M()
    {
        super();
        System.out.println("This is M");
    }
    public M(int n)
    {
        super();
        System.out.println("This is M");
    }
}

class N extends M
{
    public N() 
    {
        super();                           // Super used to call constructor of parent class
       System.out.println("This is N");
    }
    public N(int n)
    {
        super();
        System.out.println("This is int N");

    }
}

class A
{
    public static void main(String args[])
    {
        N obj = new N(4);
    }
}


