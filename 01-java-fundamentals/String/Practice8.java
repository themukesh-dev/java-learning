// Given the string "programming", count the vowels (a, e, i, o, u).
class A
{
    public static void main(String args[])
    {
        String s = "Mukesh Patil";
        int v = 0;

        for(int i=0 ; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='a'|| c=='i' || c=='o' || c=='e' || c=='u')
            {
                v++;
            }
        }
        System.out.println("No. of vowels:-" + v);
    
    }
}