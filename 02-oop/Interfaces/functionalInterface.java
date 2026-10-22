@FunctionalInterface 
interface m
{
    void show();
}
class A
{
    public static void main(String args[])
    {
         m obj = new m()
        {
            public void show()
            {
                System.out.println("In Show");
            }
        };
        obj.show();
    }
}
// Functional Interface has only one method