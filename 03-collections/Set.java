import java.util.Collection;
import java.util.HashSet;

class A
{
    public static void main(String args[])
    {
        Collection<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        
        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}
// HashSet is used to avoid duplicate values.