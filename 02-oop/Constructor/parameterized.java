class Human
{
    private int age;        // Private variables can be directly accessed only by the class in which they belong
    private String name;    // To access private variables outside the class we use methods   

    public Human()          // This is a constructor and it sets defeault values and is called whenever the object is created
    {                       // This is also known as Default Constructor
        age=12;
        name="Jonathan";
    }

      public Human(int age, String name)  //Parameterized Constructors
       {                                  // This constructor allows parameters to be taken
        this.age = age;
        this.name = name;
       }

    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;     
    }
}
class A
{
    public static void main(String args[])
    {
        Human obj = new Human();
        Human obj1 = new Human(19,"Mukesh");
        

        System.out.print(obj.getName());
        System.out.println(" "+obj.getAge());
        System.out.print(obj1.getName());
        System.out.print(" "+obj1.getAge());
    }
}