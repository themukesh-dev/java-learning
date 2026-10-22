
@FunctionalInterface 
interface M
{
    void run(int i);
}
class A
{
    public static void main(String args[])
    {
        M obj = (i)->System.out.println("Running" + i);
        obj.run(5);
       
    }
}

// Lambda Function shortens the block of code

// Before:-
// M obj = new M()
// {
//     public void run()
//     {
//         System.out.println("Running");
//     }
// }

// After:-
// M obj = ()-> System.out.println("Running");