class Parent
{
    public void show()
    {
        System.out.println("Parent Class");
    }
}
class Child extends Parent
{
    public void show ()
    {
        System.out.println("Child Class");
    }
}

public class Method_overriding {
    public static void main(String[] args) 
    {
        Child c1 = new Child();
        c1.show();

        Parent p1 = new Parent();
        p1.show();

        Parent obj = new Child();
        obj.show();
        obj.show();
    }
}
