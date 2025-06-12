class Student
{
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Student(Student s1)
    {
        this.name = s1.name;
        this.age = s1.age;
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        Student s2 = new Student(s1);
        
    }
}
