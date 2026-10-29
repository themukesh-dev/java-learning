import java.util.HashMap;
import java.util.Map;

class A
{
    public static void main(String args[])
    {
        Map<String,Integer> students = new HashMap<>();
        students.put("Mukesh",23);
        students.put("Harsh",99);
        students.put("Om",90);

        System.out.println(students.keySet());

        for(String key : students.keySet())
        {
            System.out.println(key + "-> " + students.get(key));
        }

    }
}