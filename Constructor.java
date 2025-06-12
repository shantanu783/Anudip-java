class Student
{
    String name ;
    int age ;

    Student()
    {
        System.out.println("Constructor has called");
    }

    public void print_info()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class Constructor 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.name = "Shantanu";
        s1.age = 20;
        s1.print_info();
    }
}
