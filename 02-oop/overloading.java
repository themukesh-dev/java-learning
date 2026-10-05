// Overloading allows you to reuse method name but parameters must be different
class calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}
class A
{
    public static void main(String[] args)
    {
        calc obj = new calc();
        int r = obj.add(1,2,3);
        System.out.println(r);
    }
}