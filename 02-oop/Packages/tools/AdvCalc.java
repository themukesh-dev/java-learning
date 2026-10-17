package tools;
public class AdvCalc extends Calc      // Here AdvCalc inherits properties of Calc. Means AdvCalc can perform
    {                                 //add,sub,mul,div all operations
         public int mul(int i,int j)
    {
        return i*j;
    }

    public int div(int i,int j)
    {
        return i/j;
    }
    }