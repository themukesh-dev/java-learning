// Create a StringBuffer containing "I love Java" and replace "Java" with "You" using the replace() method.
class A
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("I love Java");
        sb.replace(7,11, "You");
        System.out.println(sb);
    }
}