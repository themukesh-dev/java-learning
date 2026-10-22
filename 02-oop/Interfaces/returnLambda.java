@FunctionalInterface 
interface M
{
    int add(int i, int j);
}
class A
{
    public static void main(String args[])
    {
       
        // M obj = new M() 
        // {
        //   public int add(int i, int j)
        //   {
        //     return i+j;
        //   }
        // };
        //We can shorten this using Lambda

        M obj = (i,j)-> i+j;
        int r = obj.add(4, 3);
        System.out.println(r);
    }
}