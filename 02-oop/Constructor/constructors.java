class Human
{
    private int age;        // Private variables can be directly accessed only by the class in which they belong
    private String name;    // To access private variables outside the class we use methods   

    public Human()          // This is a constructor and it sets defeault values and is called whenever the object is created
    {
        age=12;
        name="Jonathan";
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
        Human obj1 = new Human();
        

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}