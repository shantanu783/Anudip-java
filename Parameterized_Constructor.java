class Student
{
    String name;
    int age;
    Student(String n, int a)
    {
        this.name = n;
        this.age = a;
    }

    public void display()
    {
        System.out.println(name);
    }
}


public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Shantanu", 20);
        s1.display();
    }
}
