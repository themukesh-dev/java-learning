class Mobile
{
    String brand;
    int price;
    static String name;
    
     
    public static void show(Mobile obj)
    {
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}
class A
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand="Iphone";
        obj1.price=10000;
        Mobile.name="Phone"; 
           
        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=20000;
       

        Mobile.show(obj1);
        Mobile.show(obj2);


    }
}