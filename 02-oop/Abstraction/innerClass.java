class Computer
{
    public void show()
    {
        System.out.println("In Computer");
    }
    class Laptop
    {
        public void show1()
        {
            System.out.println("In a laptop");
        }
    }
}
class A
{
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.show();

        // To access show1() of Laptop class we need a object of Computer
        // And it is written specifically as Computer.Laptop

        Computer.Laptop obj1 = obj.new Laptop();
        obj1.show1();

        // If the class is declared as static Laptop
        // We can declare Laptop without object
        // Computer.Laptop = new Laptop();
        // Only inner class can be static the outer class cannot be static

    }
}