class B extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Hi");
            try {
                sleep(10);   
            } catch (InterruptedException e) 
            {
                 e.printStackTrace();
            }
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
             try {
                sleep(10);
            } catch (InterruptedException e) 
            {
                 e.printStackTrace();
            }
        }
    }
}
class A
{
    public static void main(String args[])
    {
        B obj1 = new B();
        C obj2 = new C();
        obj2.setPriority(Thread.MAX_PRIORITY); // Here we set priority of obj 2 as max which is 10.
        obj1.start();
        obj2.start();
    }
}

// Sleeps tells the method to wait for some amount of milliseconds
// and starts again after the time is completed.
// Before Sleep
// Hi
// Hi
// Hi
// Hi
// Hi
// Hi
// Hello
// Hello
// Hello
// Hello
// Hello
// Hello

// After Sleep
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello
// Hi
// Hello