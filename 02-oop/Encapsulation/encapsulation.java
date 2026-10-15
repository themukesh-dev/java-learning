class Human
{
    private int age;        // Private variables can be directly accessed only by the class in which they belong
    private String name;    // To access private variables outside the class we use methods   

    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(int a)
    {
        age=a;
    }
    public void setName(String n)
    {
        name=n;
    }
}
class A
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(31);
        obj.setName("Mukesh");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}