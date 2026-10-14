class Mobile
{
    String brand;
    int price;
    static String name;

    static  // The static block is called only once in a program
    {
        name="Phone";
        System.out.println("This is static block");   
    }

    public Mobile()  // Constructor block is called everytime when a object is created
    {
        brand="Dummy";
        price=0;
         System.out.println("This is constructor block");
        
    }
    
     
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
        Mobile.name="Phone"; 

        Mobile obj2 = new Mobile();

        obj1.show();
        obj2.show();


           
       
       

        

    }
}