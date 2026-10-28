class Counter
{
    int counter;
    public synchronized void increment()
    {
        counter++;
    }
}
class A
{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };
        
        Runnable obj2 = () ->
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();   
        t2.join();

        System.out.println(c.counter);
    }
}

// join method tells the main function to wait until all Threads are executed.
// We use "synchronized" while writing method so that we can tell code to execute on thread at a time