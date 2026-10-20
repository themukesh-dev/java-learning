class A
{
    public static void main(String args[])
    {
        int num=7;
        Integer num1=num;  
        // Here we are storing num in a class
        // And it takes place without creating a new object
        // This operation is called boxing.
        // And since this is taking place without object creation 
        // Is is called AutoBoxing
        System.out.println(num1);

        int num2=num1;
        // Here we are assigning a class value directly to num2
        // This is called AutoUnboxing
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        // Here we have used one of the method of class Integer
        // Where we can store a string value in int using parseInt() method
        
        System.out.println(num3*2);

    }
}