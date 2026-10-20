abstract class Animal
{
    abstract public void voice();
    // Abstract class gives a general idea 
    // It doesn't say now it is implemented
    // The implementation is given by its sub class
    // It is complusory to implement the method by the sub class
    
}

class Cat extends Animal
{
    public void voice()
    {
        System.out.println("Meow Meow Meow");
    }
}

class A
{
    public static void main(String args[])
    {
        Cat obj = new Cat();
        obj.voice();
    }
}
