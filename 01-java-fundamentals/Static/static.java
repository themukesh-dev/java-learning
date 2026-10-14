class Mobile
{
    String brand;
    int price;
    static String name;
     
    public void show()
    {
        System.out.println(brand + ":" + price + ":" + name);
    }
}
class A
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand="Iphone";
        obj1.price=10000;
        Mobile.name="Phone";     // "name" becomes common variable for all objects as it is declared as static

        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=20000;
       

        obj1.show();
        obj2.show();

    }
}