class Calc // If we declare a class as final that class cannot be overridden
{
    public final void show()  // The final keyword restricts the method from been overridden
    {
        System.out.println("By Mukesh");
    }
    public void add(int i,int j)
    {
        System.out.println(i+j);
    }
}
class AdvCalc extends Calc
{
    // public void show()  // Thus we get error here as show() cannot be overridden
    // {
    //     System.out.println("By Ramesh");
    // }
}

class A
{
    public static void main(String args[])
    {
        final int m = 10;  // Final declares m as a constant whose value can't be changed
        System.out.println(m);
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(23, 34);
    }
}