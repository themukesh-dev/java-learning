// Create a method square(int n) that returns the square of a number.
class maths
{
    public int square(int n)
    {
        return n*n;
    }
}
class A
{
    public static void main(String[] args)
    {
        maths obj = new maths();
        int r = obj.square(8);
        System.out.println(r);
    }
}