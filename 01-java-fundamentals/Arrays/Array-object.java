class Students  // Created class named students
{
    String name;   // Created variables in class
    int rollno;
    int marks;
}
class A
{
    public static void main(String[] args)
    {
        Students s1 = new Students();    // Created object 1 
        s1.name="Mukesh";
        s1.rollno=23;
        s1.marks=89;

        Students s2 = new Students();
        s2.name="Mahesh";
        s2.rollno=63;
        s2.marks=67;

        Students s3 = new Students();
        s3.name="Rakesh";
        s3.rollno=27;
        s3.marks=88;

        Students children[] = new Students[3];    // Created a array named children that holds the objects in it
        children[0]=s1;     // Specifying each object as array element
        children[1]=s2;
        children[2]=s3;

        for(int i=0; i<children.length;i++)
        {
            System.out.println(children[i].name + " : " + children[i].rollno + " : " + children[i].marks);
        }

    
    }
}