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
    
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;     // .this represents the current object
    }
}
class A
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Mukesh");
        
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}