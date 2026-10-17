import tools.Calc;
import tools.AdvCalc;  
// If we use import tools.* all files in "tools" package are imported 

class A
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5,2);
        System.out.println(r1);
    }
}

// We have imported Calc and AdvCalc from package named "tools"

