class A
{
    public void show()
    {
    System.out.println("In A");
    }
}
 
class B extends A
{
    public void show()
    {
    System.out.println("In B");
    }
}

class C extends A
{
    public void show()
    {
    System.out.println("In C");
    }
}

class D
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();

        obj= new B();  // We have the same obj but now it refers to B
        obj.show();

        obj= new C();  //We have the same obj but it refers to C
        obj.show();
        // This only works when inheritance is present
        
    }
}

// The output of the program is determined only 
// at runtime during compliation it cannot be determined
// what will be executed.
//Thats why it is called Runtime Polymorphism
