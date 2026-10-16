public class MoreCalc extends AdvCalc 
{
    public int power(int i,int j)
    {
        return (int)(Math.pow(i,j));
    }
}

// This is example of multilevel inheritance 
// where MoreCalc inherits AdvCalc 
// AdvCalc inherits Calc
// Calc--->AdvCalc--->MoreCalc
