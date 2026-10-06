class Student
{
   public String display(String name)
   {
    return name;
   }
   public int display(int marks)
   {
    return marks;
   }

}
class A
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        String r = obj.display("Mukesh");
        int y = obj.display(100);
        System.out.println(r);
        System.out.println(y);


    }
}