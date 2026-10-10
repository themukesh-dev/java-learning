// Check whether a string is a palindrome
class A
{
    public static void main(String args[])
    {
        String str = "madam";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if(str.equals(sb.toString()))
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Not Palindrome");
    }
}