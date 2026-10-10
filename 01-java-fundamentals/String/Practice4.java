// Create a StringBuffer containing "Programming" and delete the characters from index 3 to index 6 (excluding index 6).
class A
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Programming");
        sb.delete(3,5);
        System.out.println(sb);
    }
}