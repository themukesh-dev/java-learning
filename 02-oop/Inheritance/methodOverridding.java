class calc
{
public int add(int n,int m)
{
    return n+m;
}
}

class AdvCalc extends calc
{
    public int add(int n,int m)  
    {
        return n+m+1;
    }
}

class A
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        int r=obj.add(4,5);
        System.out.println(r);
    }
}

// Here we have used Method Overridding Concept.
// In which we inherit properties from a class but 
// for a particular property of a class we want to modify it 
// in another class we use Method Overridding.

// calc class contain add operation which adds n+m.
// But in AdvCalc class the same add operation is modified to increment one.
// So here we have overridded add() .
// So whenever object of AdvCalc is called the new add() is executed keep the name same.