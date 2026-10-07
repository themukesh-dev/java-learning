class A
{
    public static void main(String[] args)
    {
        int num[]=new int[4];    // Creation of dynamic array
        num[0]=3;
        num[1]=4;
        num[2]=9;
        num[3]=32;

        for(int i=0;i<=3;i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("Array Displayed");
    }
}