import tools.Calc; 
 
class Calcs
{
   private int marks = 6;
  
}



class A
{
    public static void main(String args[])
    {
        Calcs obj = new Calcs();
        System.out.println(obj.marks);          // Since marks is private it cannot be accessed in other class
          
       
        Calc obj1 = new Calc();
        System.out.println(obj1.people);  // Here we can access "people" as it is public even if it is in another file
    }
}