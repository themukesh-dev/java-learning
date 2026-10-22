enum Mobile
{
    Mi(20000),Apple(1000000),Samsung(),Vivo(10000);
    private int price;

    

    private Mobile(int price) {
        this.price = price;
    }


    private Mobile()
    {
        price = 5000;
    }

    
    public int getPrice() 
    {
        return price;
    }

}
class A
{
    public static void main(String args[])
    {
        Mobile m = Mobile.Mi;
        System.out.println(m + ":" + m.getPrice());

    }
}