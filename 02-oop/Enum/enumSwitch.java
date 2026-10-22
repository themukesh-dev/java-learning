enum Status
{
    Started,Failed,Rebuild;
}
class A
{
    public static void main(String args[])
    {
        Status s = Status.Rebuild;

        switch (s) 
        {
            case Started :
                System.out.println("Lets goo");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            default:
                System.out.println("Make it again");
                break;
        }
    }
}