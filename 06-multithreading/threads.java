class B extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class C extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Hello");
        }
    }
}
class A
{
    public static void main(String args[])
    {
        B obj1 = new B();
        C obj2 = new C();
        obj1.start();
        obj2.start();
    }
}