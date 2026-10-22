enum Status
{
    Started,Failed,Rebuild;
}
class A
{
    public static void main(String args[])
    {
       int n =11;
       if(n%2==0)
       {
        Status s = Status.Started;
        System.out.println(s);
       }
       else
       {
        Status s = Status.Failed;
        System.out.println(s);
       }
}
}
// enum is used to define fixed set of predefined constant values