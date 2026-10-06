class Calculator  // Class created
{
    public int add(int n1,int n2)  // Method created
    {
        int r=n1+n2;
        return r;
    }
}
class A
{
    public static void main(String[] args)
    {
        int num1=5;
        int num2=6;

        Calculator calc = new Calculator();   // Object created
        int result=calc.add(num1,num2);
        System.out.println(result);
    }
}