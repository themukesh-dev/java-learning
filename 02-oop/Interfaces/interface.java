interface Car
{
    int age = 25; // Static and Final
    void drive();
    void music();
}
class B implements Car
{
    public void drive()
    {
        System.out.println("Driving car");
    }
    public void music()
    {
        System.out.println("Playing Music");
    }
}
class A
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.drive();
        obj.music();
        System.out.println(Car.age);

    }
}
// Interface is a by default abstract class
// where all methods are abstract.
// So we do not have to write "abstract public"
// Variables inside interface are final and static.
// Final means they are constants
// Static means they can be called just by mentioning interface name.
// A class can inherit multiple interfaces