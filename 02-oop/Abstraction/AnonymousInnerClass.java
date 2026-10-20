class C
{
    public void show()
    {
        System.out.println("In C Show");
    }
    
}
class A
{
    public static void main(String args[])
    {
        C obj = new C()
        {
            public void show()
            {
                System.out.println("In new show");
            }
        };
        
        // Here we have created a anonymous inner class
        // It is created when we know that we want to modify that
        // method only once and then we do not require modification.
        // So rather than overridding it by making a new class
        // we use this type of anonymous inner class
        // We can use this when we have a abstract class so rather than
        // creating an new class that extends the abstract class we simply use anonymous inner class
        
        obj.show();
    }
}