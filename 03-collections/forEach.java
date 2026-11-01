import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class A
{
    public static void main(String args[])
    {
        List<Integer> nums =  Arrays.asList(2,3,5,8,44,8,33);
       
        nums.forEach(n -> System.out.println(n));
    }
}