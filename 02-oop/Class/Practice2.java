// Create a method isEven(int n) that returns true if the number is even.
class maths
{
    public String isEven(int n)
    {
        if(n%2==0)
        {
            return "Even";
        }
        else
        return "Odd";
    }
}
class A
{
    public static void main(String[] args)
    {
        maths obj = new maths();
        String s = obj.isEven(12);
        System.out.println(s);
    }

}