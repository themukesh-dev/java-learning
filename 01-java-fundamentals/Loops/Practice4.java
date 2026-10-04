// Write a Java program to calculate and print the sum of numbers from 1 to 10 using a for loop.
class A
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
             sum = sum + i;
        }
        System.out.println("The sum is "+ sum);
    }
}