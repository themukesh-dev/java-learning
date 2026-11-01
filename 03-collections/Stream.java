import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class A
{
    public static void main(String args[])
    {
        List<Integer> nums = Arrays.asList(2,5,4,3,1,7,5);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%21!=0);
        Stream<Integer> s3 = s2.map(n -> n*2);
       
        s3.forEach(n -> System.out.println(n));

    }
}
// The whole program can also be written in short as:-
// nums.stream()
//     .filter(n -> n%2!=0);
//     .map(n -> n*2);