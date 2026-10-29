import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

class A
{
    public static void main(String args[])
    {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(23);
        nums.add(34);
        nums.add(21);
        nums.add(90);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) 
        {
            System.out.println(values.next());
        }
    }
}

// TreeSet helps you to prrint numbers in a specific order
// Here they are been printing in ascending order
