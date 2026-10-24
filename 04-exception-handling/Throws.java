class N
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");
    }
}
public class Throws
{
     static 
        {
            System.out.println("Class Loaded");
        }
}
class A
{
    public static void main(String args[])
    {
       N obj = new N();
       try 
       {
        obj.show();
       }
     catch (ClassNotFoundException e) 
     {
        System.out.println("Class not found" + e);
     }
    }

    
}