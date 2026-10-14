class Student
{
    String name;
    int roll_number;
    static String branch;
    int marks;
    String pass;
    
    static 
    {
        branch = "INFT";
       
    }

    public String pass()
    {
       
        if(marks>=41)
        {
          return "Pass";
        }
        else
        return "Fail";
    }
}

class Main
{
public static void main(String a[])
{
   int total=0;
   int p=0;
   int f=0;
   int max=0;
    
    // Sample Student Data
    Student s1 = new Student();
    s1.name="Mukesh Patil";
    s1.roll_number=101;
    s1.marks=89;
    
    

    Student s2 = new Student();
    s2.name="Ramesh Tiwari";
    s2.roll_number=102;
    s2.marks=78;


    Student s3 = new Student();
    s3.name="Anjali Parab";
    s3.roll_number=103;
    s3.marks=83;

    Student s4 = new Student();
    s4.name="Mayur Kadam";
    s4.roll_number=104;
    s4.marks=37;
   

    Student s5 = new Student();
    s5.name="Rakesh Rahatwal";
    s5.roll_number=105;
    s5.marks=21;
   
     Student s6= new Student();
    s6.name="Sai Patil";
    s6.roll_number=106;
    s6.marks=98;
    

    Student children[] = new Student[6];   // Creates objects as array
    children[0]=s1;
    children[1]=s2;
    children[2]=s3;
    children[3]=s4;
    children[4]=s5;
    children[5]=s6;

   
System.out.printf("%-30s %-10s %-10s %-10s%n",
        "Name", "Roll No.", "Marks", "Status");

System.out.println("---------------------------------------------------------------");

for (int i = 0; i < children.length; i++)
{
    System.out.printf("%-30s %-10d %-10d %-10s%n",
            children[i].name,
            children[i].roll_number,
            children[i].marks,
            children[i].pass());
}


    for(int j=0;j<children.length;j++)      //Calculates the average marks
    {
        
        total = total + children[j].marks;

    }
    int avg = total/children.length; 
    System.out.println();
    System.out.println("Average:- " +avg);

    for(int i=0;i<children.length;i++)      // Calculates number of students passed and failed
    {
      if(children[i].pass().equals("Pass"))
      {
        p++;
      }
      else
        f++;
    }
    System.out.println();
    System.out.println("Passed:- " +p);
    System.out.println();
    System.out.println("Failed:- " +f);

    for(int i=0;i<children.length;i++)  // Finds maximum marks
    {
       if(max<children[i].marks) 
       {
        max=children[i].marks;
       }
    }
    System.out.println();
    System.out.println("Maximum Marks:- "+ max );
    System.out.println();

    for(int i=0;i<children.length;i++)  // Prints name of topper
    {
        if(children[i].marks==max)
        {
            System.out.println("Name of Topper:- "+ children[i].name);
        }
    }

}

}
