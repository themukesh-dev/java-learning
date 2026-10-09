class A
{
    public static void main(String[] args)
    {
        String name = "Mukesh"; // Mukesh stored in heap 
        name = name + " Patil";
        
        // Here it is not like Mukesh Patil is updated with the previous
        // Mukesh in memory.
        // Rather a new data is stored in memory as Mukesh Patil 
        // And the previous Mukesh goes in bin
       
        System.out.println(name);

        String s1 = "Yogesh";
        String s2 = "Yogesh";
        
        // Here Yogesh is stored only once in memory and s1 and s2 
        // refer to same address of Yogesh.

        System.out.println(s1==s2);  // Here output is true which means that s1 and s2 refer to same address
        


    
    }
}