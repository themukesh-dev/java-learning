// Create a program for electricity units:
// 0–100 → "Low Usage"
// 101–300 → "Moderate Usage"
// 301–500 → "High Usage"
// Above 500 → "Very High Usage"

class a
{
    public static void main(String arg[])
    {
        int a=80;
        if(a>500)
        {
            System.out.println("Very high usage");
        }
        else if(a>=301 && a<=500)
        {
            System.out.println("High usage");
        }
        else if(a>=101 && a<=300)
        {
            System.out.println("Moderate usage");
        }
        else
        System.out.println("Low usage");
    }
}