class Student{

    String name;
    int age;

    Student( String n, int a){
        name=n;
        age=a;

        System.out.println(name+age);
    }
}


public class Paramerized {
    public static void main(String[] args) {
        Student obj = new Student("S", 19);
    }
    
}
