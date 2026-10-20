class C
{
    public void show()
    {
        System.out.println("IN A");
    }
}

class D extends C
{
    public void show1()
    {
        System.out.println("IN B");
    }
}
class A
{
    public static void main(String args[])
    {
        C obj = new D();  //The obj refers to C but the object is of D
                          // The object is of D but it refers to C. We are refering to upper class
                          // Thus , we are upcasting  
        obj.show(); 

        D obj1 = (D) obj;  // Here we are creating obj1 of D but we are casting with the obj refered to C
                           // Thus we are refering a down class object by upper class object
                           //Thus we are downcasting  
        obj1.show1();
        


    }
}