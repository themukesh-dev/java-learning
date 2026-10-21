interface vehicle
{
    void mode();
}
class bike implements vehicle
{
    public void mode()
    {
        System.out.println("Bike Granted");
    }
}
class car implements vehicle
{
    public void mode()
    {
        System.out.println("Car Granted");
    }
}
class Student
{
    public void demand(vehicle v)
    {
        System.out.println("Ab hogi padhai");
    }
}
class A
{
    public static void main(String args[])
    {
        vehicle bike = new bike();
        vehicle car = new car();

        Student Mukesh = new Student();
        Mukesh.demand(car);
        car.mode();

    }
}