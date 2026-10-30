import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class A
{
    public static void main(String args[])
    {
        Comparator<Integer> com = new Comparator<Integer>() 
        {
            public int compare(Integer i , Integer j)
            {
            if(i%10 > j%10)
                return 1;
            else
                return -1;
            }

        };

        List<Integer> nums = new ArrayList<>();
       
        nums.add(11);
        nums.add(39);
        nums.add(90);
        nums.add(98);
        nums.add(37);
       
        
        
        Collections.sort(nums,com);
        

        System.out.println(nums);
        

    }
}
//Comparator helps to define custom logic for sorting