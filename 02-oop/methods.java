class timepass
{
    public void playMusic()
    {
        System.out.println("Music playing");
    }
    public String getpen(int cost)
    {
        if(cost>=10)
        {
            return "Pen";
        }
        else
        return "Nothing";
    }
}
class A
{
    public static void main(String[] args)
    {
        timepass obj = new timepass();
        obj.playMusic();
        String str = obj.getpen(1);
        System.out.println(str);
    }
}